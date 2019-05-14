#!/usr/bin/env bash

RED="\033[31m"
GREEN="\033[32m"
YELLOW="\033[33m"
NORMAL="\033[0;39m"

IMAGE_NAME=mysql
TAG=5.7
CONTAINER_NAME=mysql
PASSWORD=admin # Default User root
DATABASE=users
PORT=3307 # Default is 3306

echo -e "${GREEN}"
cat << "EOF"

#############################################
############# MYSQL DEPLOYMENT ##############
#############################################

EOF
echo -e "${NORMAL}"

echo -e "${GREEN}[[INFO]]: Running MySQL on Port $PORT ${NORMAL}"

docker rm -f $CONTAINER_NAME 2> /dev/null
docker run --name $CONTAINER_NAME -p $PORT:3306 -e MYSQL_ROOT_PASSWORD=$PASSWORD -e MYSQL_DATABASE=$DATABASE -d $IMAGE_NAME:$TAG

echo -e "${GREEN}[[INFO]]: Success ${NORMAL}"

echo -e "${GREEN}"
cat << "EOF"

#############################################
#############################################

EOF
echo -e "${NORMAL}"