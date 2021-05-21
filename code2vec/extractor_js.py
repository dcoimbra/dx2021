import subprocess
import hashlib

class Extractor:

    def __init__(self):
      self.max_contexts = 200

    def extract_paths(self, path):
        command = ['node', 'JSExtractor/build/index.js', '-f', path]
        process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        out, err = process.communicate()
        output = out.decode().splitlines()
        print(output)
        if len(output) == 0:
            err = err.decode()
            raise ValueError(err)
        hash_to_string_dict = {}
        result = []
        for i, line in enumerate(output):
            parts = line.rstrip().split(' ')
            method_name = parts[0]
            current_result_line_parts = [method_name]
            contexts = parts[1:]
            print(contexts)
            for context in contexts[:self.max_contexts]:
                context_parts = context.split(',')
                print(context_parts)
                context_word1 = context_parts[0]
                context_path = context_parts[1] 
                context_word2 = context_parts[2]
                hashed_path = str(self.path_hashcode(context_path))
                hash_to_string_dict[hashed_path] = context_path
                current_result_line_parts += ['%s,%s,%s' % (context_word1, hashed_path, context_word2)]
            space_padding = ' ' * (self.max_contexts - len(contexts))
            result_line = ' '.join(current_result_line_parts) + space_padding
            result.append(result_line)
        return result, hash_to_string_dict

    @staticmethod
    def path_hashcode(s):
        """
        Imitating Java's String#hashCode, because the model is trained on hashed paths but we wish to
        Present the path attention on un-hashed paths.
        """
        result = hashlib.md5(s.encode())
        return result.hexdigest()