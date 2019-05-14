#!/usr/bin/env bash

RED="\033[31m"
GREEN="\033[32m"
YELLOW="\033[33m"
NORMAL="\033[0;39m"

# This is a Private Image. Create your own Oracle XE Image if you need to test
IMAGE_NAME=pubuduwelagedara/oracle
TAG=latest
CONTAINER_NAME=oracle
PASSWORD=1234ZXC
PORT=1521
DATA_DIRECTORY=/Users/pl91347/Projects/oracle

echo -e "${GREEN}"
cat << "EOF"

#############################################
############# ORACLE DEPLOYMENT #############
#############################################

EOF
echo -e "${NORMAL}"

echo -e "${GREEN}[[INFO]]: Running Oracle on Port $PORT ${NORMAL}"

docker rm -f $CONTAINER_NAME 2> /dev/null
docker run --name $CONTAINER_NAME -p $PORT:1521 -p 5500:5500 -e ORACLE_PWD=$PASSWORD -e ORACLE_CHARACTERSET=AL32UTF8 -v $DATA_DIRECTORY:/opt/oracle/oradata -d $IMAGE_NAME:$TAG

echo -e "${GREEN}[[INFO]]: Success ${NORMAL}"

echo -e "${GREEN}"
cat << "EOF"

#############################################
#############################################

EOF
echo -e "${NORMAL}"


