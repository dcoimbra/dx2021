#!/bin/bash

rm vlc.jsonl
python3 ./cpp2jsonl.py -l /home/tomerg1/git/sources/vlc/src -jl vlc.jsonl
cp ./vlc.jsonl astminer/dataset/
cd astminer
./cli.sh vlc

