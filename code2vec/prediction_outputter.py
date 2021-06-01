context_paths = "devign.test.raw.txt"
json_file = "../astminer/dataset/test.jsonl"
predictions_file = "predictions_test.txt"

from interactive_predict import SHOW_TOP_CONTEXTS
from common import common
from code2vec import load_model_dynamically
from config import Config
import json
config = Config(set_defaults=True, load_from_args=True, verify=True)
model = load_model_dynamically(config)

dicti = {
    "safe": 0,
    "vuln": 1
}

with open(json_file) as sample_file, open(context_paths) as contexts_file, open(predictions_file, "w") as predictions:
    for sample, function in zip(sample_file, contexts_file):
        sample = json.loads(sample.strip())
        parts = function.rstrip().split(' ')
        method_name = parts[0]
        current_result_line_parts = [method_name]
        contexts = parts[1:]

        for context in contexts[:200]:
            context_parts = context.split(',')
            context_word1 = context_parts[0]
            context_path = context_parts[1] 
            context_word2 = context_parts[2]
            current_result_line_parts += ['%s,%s,%s' % (context_word1, context_path, context_word2)]
        space_padding = ' ' * (200 - len(contexts))
        result_line = ' '.join(current_result_line_parts) + space_padding
        raw_prediction_results = model.predict([result_line])
        method_prediction_results = common.parse_prediction_results(
                raw_prediction_results,
                model.vocabs.target_vocab.special_words, topk=SHOW_TOP_CONTEXTS)
        for raw_prediction, method_prediction in zip(raw_prediction_results, method_prediction_results):
            predictions.write(f"{sample['idx']}\t{dicti[method_prediction.predictions[0]['name'][0]]}\n")
