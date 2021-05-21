type=path-injection-balanced-disjoint
dataset_name=path-injection-balanced-disjoint

python code2vec.py --load models/${type}/saved_model --test data/${type}/${dataset_name}.test.c2v
