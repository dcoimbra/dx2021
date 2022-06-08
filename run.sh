#!/bin/bash

# rm vlc.jsonl
# python3 ./cpp2jsonl.py -l /home/tomerg1/git/sources/vlc/src -jl vlc.jsonl
# cp ./vlc.jsonl astminer/dataset/
# cd astminer
# ./cli.sh vlc
rm ./all.jsonl
python ./cpp2jsonl.py -s -l /mnt/d/GitHub_Clones/scripts/C_Dataset/test -m ./ClassMap/classMap.json
cp ./train.jsonl astminer/dataset/
cp ./test.jsonl astminer/dataset/
cp ./valid.jsonl astminer/dataset/
cd astminer
./cli.sh train
./cli.sh test
./cli.sh valid
cd ../code2vec
source preprocess.sh
./train.sh