#!/bin/bash
cd collector

mvn  clean package

if [ $? -ne 0 ]; then
    echo "Maven build failed. Exiting script."
    exit 1
fi

cd target

java -jar Collector-0.0.1-SNAPSHOT-jar-with-dependencies.jar -c ../../config.txt &
listener_pid=$!
echo $listtener_pid
sleep 10
cd ../../

x-terminal-emulator -e "bash -c './runpython.sh; exec bash'"

kill $listener_pid
