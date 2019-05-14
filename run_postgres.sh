#!/usr/bin/env bash

RED="\033[31m"
GREEN="\033[32m"
YELLOW="\033[33m"
NORMAL="\033[0;39m"

IMAGE_NAME=postgres
TAG=latest
CONTAINER_NAME=postgres
PASSWORD=admin # Default User postgres
DATABASE=users
PORT=5442 # Default is 5432

echo -e "${GREEN}"
cat << "EOF"

#############################################
########### POSTGRES DEPLOYMENT #############
#############################################

EOF
echo -e "${NORMAL}"

echo -e "${GREEN}[[INFO]]: Running PostgreSQL on Port $PORT ${NORMAL}"

docker rm -f $CONTAINER_NAME 2> /dev/null
docker run --name $CONTAINER_NAME -p $PORT:5432 -e POSTGRES_PASSWORD=$PASSWORD -e POSTGRES_DB=$DATABASE -d $IMAGE_NAME:$TAG

echo -e "${GREEN}[[INFO]]: Success ${NORMAL}"

echo -e "${GREEN}"
cat << "EOF"

#############################################
#############################################

EOF
echo -e "${NORMAL}"