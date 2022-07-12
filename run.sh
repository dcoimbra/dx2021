#!/bin/bash

# rm vlc.jsonl
# python3 ./cpp2jsonl.py -l /home/tomerg1/git/sources/vlc/src -jl vlc.jsonl
# cp ./vlc.jsonl astminer/dataset/
# cd astminer
# ./cli.sh vlc
#rm ./all.jsonl

python ./cpp2jsonl.py -l /mnt/d/GitHub_Clones/scripts/C_Dataset/test -np -m ./ClassMap/classMap.json -jl all_benchmark.jsonl -s -sm
# NO SPLIT FOR THE TEST
python ./cpp2jsonl.py -l /mnt/d/GitHub_Clones/scripts/C_Dataset/test2 -m ./ClassMap/classMap.json -jl test.jsonl -sm
cp ./train.jsonl astminer/dataset/
cp ./test.jsonl astminer/dataset/
cp ./valid.jsonl astminer/dataset/

echo Running on code snippets
cd astminer
./cli.sh train 10
./cli.sh test 10
./cli.sh valid 10
cd ../code2vec
source preprocess.sh
./train.sh
python3 code2vec.py --load models/devign/saved_model --release
python3 code2vec.py --load models/devign/saved_model.release --test data/devign/devign.test.c2v
cd ..
#TODO - find which model to try with
#

echo Running on functions
cd astminer
./cli.sh train
./cli.sh test
./cli.sh valid
cd ../code2vec
source preprocess.sh
./train.sh
python3 code2vec.py --load models/devign/saved_model --release
python3 code2vec.py --load models/devign/saved_model.release --test data/devign/devign.test.c2v
cd ..

echo Training on functions, validation on snippets
cd astminer
./cli.sh train 
./cli.sh test 10
./cli.sh valid 10
cd ../code2vec
source preprocess.sh
./train.sh
python3 code2vec.py --load models/devign/saved_model --release
python3 code2vec.py --load models/devign/saved_model.release --test data/devign/devign.test.c2v
cd ..