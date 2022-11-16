#!/bin/bash
WD=$(PWD)
echo "$WD"
if [[ ! "$WD" == *"/openapi" ]]
then
    echo "You must be inside the /openapi directory to run this script."
    exit
fi

mkdir -p ./bin
curl https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh > ./bin/openapi-generator.sh
chmod u+x ./bin/openapi-generator.sh

rm -rf ./.backend/* ./.frontend/*
mkdir -p ./.backend ./.frontend

bin/openapi-generator.sh generate -i openapi.yaml -g jaxrs-spec --package-name "de.planty.gen" --api-package "de.planty.gen.api" --model-package "de.planty.gen.model" --model-name-prefix "Gen" -o ./.backend
bin/openapi-generator.sh generate -i openapi.yaml -g typescript-angular --type-mappings "DateTime=Date" -o ./.frontend

mkdir -p ../backend/src/main/java/de/planty/gen
cp -r ./.backend/src/gen/java/de/planty/gen/* ../backend/src/main/java/de/planty/gen

mkdir -p ../frontend/src/assets/ts-api-client
cp ./.frontend/*.ts ../frontend/src/assets/ts-api-client
cp -r ./.frontend/api ../frontend/src/assets/ts-api-client
cp -r ./.frontend/model ../frontend/src/assets/ts-api-client

rm -rf ./.backend ./.frontend