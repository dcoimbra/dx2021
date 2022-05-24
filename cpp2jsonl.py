import sys
import clang
import clang.cindex
import json
import os
import argparse
from tqdm import tqdm
from ClassMap.classMap import mapper

combined_jsonl = "all.jsonl"
train_jsonl = "train.jsonl"
test_jsonl = "test.jsonl"
valid_jsonl = "valid.jsonl"
folder_path = "/mnt/d/GitHub_Clones/scripts/C_Dataset"
train_ratio = 0.8
test_ratio = 0.1
max_lines = 0


path = "/usr/lib/llvm-10/lib/libclang.so.1"
clang.cindex.Config.set_library_file(path)

def method_definitions(cursor):
    for i in cursor.walk_preorder():
        if i.kind != clang.cindex.CursorKind.CXX_METHOD and i.kind != clang.cindex.CursorKind.FUNCTION_DECL:
            continue
        if not i.is_definition():
            continue
        yield i


def dump_functions(file_path, project, out_file_path, max_lines = max_lines, min_lines = 1, label = None):
    # print("dump_functions", file_path, project)
    # necessary to deal with the symlinks
    file_path = os.path.realpath(file_path)

    index = clang.cindex.Index.create()
    try:
        tu = index.parse(file_path, options=clang.cindex.TranslationUnit.PARSE_DETAILED_PROCESSING_RECORD)
    except Exception as e:
        print(f"Failed parsing {file_path}, error {e}")
        return

    defns = method_definitions(tu.cursor)
    with open(file_path) as src:
        lines = src.readlines()

    file_name = file_path.split(os.sep)[-1]
    
    with open(out_file_path, "at") as jsonl:  
        for function_node in defns:
            # print(dir(function_node))
            if function_node.location.file.name != file_path:
                continue
            if function_node.extent.end.line - function_node.extent.start.line > min_lines:
                # print(function_node.location.file, function_node.displayname)
                # TODO - consider columns as well
                func_lines = lines[function_node.extent.start.line - 1 : function_node.extent.end.line]
                if max_lines > 0:
                   func_lines = func_lines[:max_lines] 
                elif max_lines < 0:
                   func_lines = func_lines[max_lines:] 
                body = "".join(func_lines)
                body = body.encode("unicode_escape").decode("utf-8")
                # print(body)
                # for line in range(function_node.extent.start.line, function_node.extent.end.line + 1):
                #     print(lines[line - 1], end='')
                # The replace below is required to get rid of the double backquotes introduced by json's dump and dumps
                func_dict = {"project": project, "file":file_name, "func": body}
                if label is not None:
                    func_dict['label'] = label
                json_s = json.dumps(func_dict).replace("\\\\","\\")

                jsonl.write(json_s)
                jsonl.write(os.linesep)


def walkdir(folder):
    """Walk through every file in a directory"""
    for root, dirs, files in os.walk(folder):
        for filename in files:
            yield root, filename


def parse_sources(location, out_file_path=combined_jsonl, max_lines=max_lines, class_map = None):
    # Precomputing files count
    files_count = 0
    for _ in tqdm(walkdir(location)):
        files_count += 1

    class_mapper = None
    if class_map is not None:
        class_mapper = mapper(class_map, location)

    print("Found %d files"%files_count)
    # Computing for real
    for root, filename in tqdm(walkdir(location), total=files_count):
        if filename.endswith(".cpp") or filename.endswith(".c"):
            dump = True
            if class_mapper is not None:
                # add only mapped files
                label = class_mapper.getFileClass(os.path.sep.join([root, filename]))
                if label.lower() == "unknown":
                    dump = False
            if dump:
                project = root[len(location) + len(os.sep):].split(os.sep)[0]
                dump_functions(os.path.join(root, filename), project, out_file_path, max_lines, label=label)

def split_dataset(combined_jsonl_path, train_ratio, test_ratio):
    # we need to read the lines counting them for each project, then split
    # assumptions:
    # 1. Continuity of the projects in the combined file
    # 2. The entire combined files fits into memory

    with open(combined_jsonl_path) as src:
        lines = src.readlines()

    train_f = open(train_jsonl, "wt")
    test_f = open(test_jsonl, "wt")
    valid_f = open(valid_jsonl, "wt")
    curr_proj = ""
    start = -1
    end = -1
    def _write_splits():
        train_end = int(start + (end - start)*train_ratio)
        for idx in range(start, train_end):
            if len(lines[idx]):
                train_f.write(lines[idx])
        val_end = train_end + int((end - start)*(1.0 - (train_ratio + test_ratio)))
        for idx in range(train_end, val_end):
            if len(lines[idx]):
                valid_f.write(lines[idx])
        for idx in range(val_end, end):
            if len(lines[idx]):
                test_f.write(lines[idx])
        print("%s: from %d to %d. train_end %d, val_end %d" % (curr_proj, start, end, train_end, val_end))

    for l_idx, line in enumerate(lines):
        try:
            func = json.loads(line)
            if func['project'] != curr_proj:
                end = l_idx
                if start != -1:
                    # we completed the previous project
                    _write_splits()
                curr_proj = func['project']
                start = end
        except Exception as e:
            print("Skipping invalid line", line[:160])
            lines[l_idx] = "" # This will mark it as invalid
    end = l_idx
    _write_splits()


# Test
# with open("/mnt/d/GitHub_Clones/scripts/C_Dataset/vlc/src/test/shared_data_ptr.cpp") as src:
#     lines = src.readlines()
#     body = "".join(lines[:3])
#     body = body.encode("unicode_escape").decode("utf-8")
#     print(body)


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument("-l", "--location", help="C/C++ files location. Defaults to %s." % folder_path, default=folder_path)
    parser.add_argument("-jl", "--jsonl_location", help="The combined JSONL file location. Defaults to %s." % combined_jsonl, default=combined_jsonl)
    parser.add_argument("-s", "--split", help="Perform splitting to train/validation/test. Defaults to false.", action='store_true')
    parser.add_argument("-np", "--no_parse", help="Do not parse the sources. Defaults to false.", action='store_true')
    parser.add_argument("-train", "--train_ratio", type=float, help="The ratio of the data to out into train.jsonl. Defaults to %.1f." % train_ratio, default=train_ratio)
    parser.add_argument("-test", "--test_ratio", type=float, help="The ratio of the data to out into test.jsonl. Defaults to %.1f." % test_ratio, default=test_ratio)
    parser.add_argument("-maxl", "--max_lines", type=int, help="The number of function lines to keep. 0 means - use the entire function. Negative values keep the last lines. Defaults to %d." % max_lines, default=max_lines)
    parser.add_argument("-m", "--class_map", help="Class mapping json file location.")
    args = parser.parse_args()
    print(args)
    if not args.no_parse:
        parse_sources(args.location, args.jsonl_location, args.max_lines, args.class_map)
    if args.split:
        split_dataset(args.jsonl_location, args.train_ratio, args.test_ratio)

# dump_functions("/mnt/d/GitHub_Clones/scripts/C_Dataset/vlc/src/test/shared_data_ptr.cpp"
#     # sys.argv[1]
#     )
