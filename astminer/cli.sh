#!/bin/bash

java -Xms12G -Xmx16G -jar build/shadow/lib-*.jar "$@"
