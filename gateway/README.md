https://spring.io/guides/gs/gateway/

```
export JAVA_HOME=/usr/lib/jvm/openjdk-17/
```

build
```
./gradlew build
```

run
```
./gradlew bootRun
or
/usr/lib/jvm/openjdk-18/bin/java -jar restPayroll-0.0.1-SNAPSHOT.jar
```


check rest endpoints
```
curl -v localhost:8080/employees
curl -v localhost:8080/employees/99
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
curl -X DELETE localhost:8080/employees/3

```
