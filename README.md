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

Build locally.
```
$ sudo chown -fR $(id -u):$(id -g) `find ./ -user root`
or simply
$ sudo rm -fR image-myapp/projects/myapp/target/
$ mvn package -f image-myapp/projects/myapp/pom.xml
```

Debug locally.  
Use vscode and provided launch.json as starting point.