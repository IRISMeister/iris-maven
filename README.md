# iris-maven

Build a maven container image.
```
$ ./build-maven-image.sh
```

Build a maven project by using it.
```
$ ./build.sh
```

Start an IRIS Server.
```
$ docker-compose up -d
```

Start a maven app and let it connect to the IRIS.
```
$ ./run.sh
```
