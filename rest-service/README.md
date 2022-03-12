https://spring.io/guides/gs/rest-service/

```
export JAVA_HOME=/usr/lib/jvm/jdk-17/
```

# step to start a project
1. start one here https://start.spring.io/
   dependency pick "Spring Web"
2. extract the downloaded zip file to a directory
3. import the project into eclipse.
4. start editing the code, example src/main/java/ch/weetech/restservice/GreetingController.java

# run the springboot
```
$ ./gradlew bootRun
```
or build jar
```
$ ./gradlew build
$ java -jar build/libs/rest-service-0.0.1-SNAPSHOT.jar
```

# check in browser
http://localhost:8080/greeting
http://localhost:8080/greeting?name=test

