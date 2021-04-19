#!/bin/bash
cp Dockerfile.mavenc irisdemo-base-mavenc/Dockerfile
pushd irisdemo-base-mavenc
./build.sh
popd