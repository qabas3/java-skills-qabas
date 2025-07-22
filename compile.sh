#!/bin/bash
mkdir -p bin

javac -d bin src/*.java

if [ $? -eq 0 ]; then
    echo "Compilation successful! Check the 'bin' folder for .class files."
else
    echo "Compilation failed. Please check your code for errors."
fi
