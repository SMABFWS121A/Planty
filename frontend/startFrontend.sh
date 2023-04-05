#!/bin/bash

# Check if user is in the frontend directory
WD=$(pwd)
if [[ ! "$WD" == *"/frontend" ]]
then
    echo "You must be inside the /frontend directory to run this script."
    exit
fi

# Build docker image
docker build -t planty-frontend .

# Run yarn install inside container
docker run -it --rm --name planty-frontend -v $WD:/app planty-frontend yarn install

# Run frontend inside container
docker run -itd --rm --name planty-frontend -v $WD:/app -p 4200:4200 planty-frontend ng serve --poll 2000 --disable-host-check --host 0.0.0.0
docker logs -f planty-frontend