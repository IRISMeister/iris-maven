#!/bin/bash
VERSION=`cat ./VERSION`
DOCKER_TAG="version-${VERSION}"

source ./buildtools.sh

# funtion build_java_project will add a line with the full image name of each image built
# But we need to start with an empty file:
rm -f ./images_built

build_java_project "image-myapp"
