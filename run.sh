#!/usr/bin/env bash

echo "ParallelOldGC, sterta 256m"
export MAVEN_OPTS="-XX:+UseParallelOldGC -Xms256m -Xmx256m"
mvn compile exec:java

echo "CMS, sterta 256m"
export MAVEN_OPTS="-XX:+UseConcMarkSweepGC -Xms256m -Xmx256m"
mvn compile exec:java

echo "G1, sterta 256m"
export MAVEN_OPTS="-XX:+UseG1GC -Xms256m -Xmx256m"
mvn compile exec:java
