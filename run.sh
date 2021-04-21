#!/bin/bash
source ./params.sh
docker run --add-host=irishost:$WEBHOST dpmeister/demo:myapp-version-2.6.0
