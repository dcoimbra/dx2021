#!/bin/bash

java -Xms8G -Xmx12G -jar build/shadow/lib-*.jar "$@"
