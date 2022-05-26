#!/bin/bash


python3 ./cpp2jsonl.py -l /home/tomer/git/sources/vlc/src -jl vlc.jsonl -s
cp ./train.jsonl astminer/dataset/
cp ./test.jsonl astminer/dataset/
cp ./valid.jsonl astminer/dataset/
rm all.jsonl
rm ./train.jsonl
rm ./test.jsonl
rm ./valid.jsonl
cd astminer
./cli.sh train
./cli.sh test
./cli.sh valid
cd ../code2vec
source preprocess.sh
#./train.sh