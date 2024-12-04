#!/bin/bash
cd collector

mvn package clean

if [ $? -ne 0 ]; then
    echo "Maven build failed. Exiting script."
    exit 1
fi

cd target

java -jar Collector-0.0.1-SNAPSHOT-jar-with-dependencies.jar -c ../../config.txt &
listener_pid=$!
sleep 5
cd ../../../..
source venv/bin/activate
cd coding_task/java_templates/
python3 example.py
