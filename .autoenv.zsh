#!/bin/bash -w
PROJECT_ROOT=`dirname $0`;

alias make="(cd $PROJECT_ROOT ; ./gradlew clean build)"
alias api-start="java -jar $PROJECT_ROOT/api/build/libs/api-1.0.0-SNAPSHOT.jar"
alias frontend-start="java -jar $PROJECT_ROOT/frontend/build/libs/frontend-1.0.0-SNAPSHOT.jar"
