#!/bin/bash
source ./params.sh
docker run --add-host=irishost:$IRISHOST dpmeister/demo:myapp-version-2.6.0
