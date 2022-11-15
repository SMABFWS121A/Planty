#!/bin/bash
mkdir -p ./bin
curl https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh > ./bin/openapi-generator.jar
chmod u+x ./bin/openapi-generator.jar
bin/openapi-generator.jar
