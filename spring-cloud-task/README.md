https://spring.io/guides/gs/spring-cloud-task/

wtf this tutorial is incomplete, there is no code on spring on how to run the short live application...

```
export JAVA_HOME=/usr/lib/jvm/openjdk-19/
```

build
```
./gradlew build
```

run
```
./gradlew bootRun
```


db setup via docker
```
docker exec -it mariadb mariadb --user root -ppassword
use task;
show tables; --show all tables that Spring Cloud Task created
select * from task_execution;

```
