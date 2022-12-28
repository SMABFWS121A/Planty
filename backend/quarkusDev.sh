#!/bin/bash

# Checks
WD=$(pwd)
if [[ ! "$WD" == *"/backend" ]]
then
    echo "You must be inside the /backend directory to run this script."
    exit
fi

# Run quarkus in dev hot re-compile mode
quarkus dev
