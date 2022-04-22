https://spring.io/guides/gs/producing-web-service/

```
export JAVA_HOME=/usr/lib/jvm/jdk-17/
```

build
```
./gradlew build
```

run
```
./gradlew bootRun
or
/usr/lib/jvm/jdk-17/bin/java -jar build/libs/gs-producing-web-service-0.1.0.jar
```


```
curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws
```
