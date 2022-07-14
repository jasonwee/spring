https://spring.io/guides/topicals/spring-on-kubernetes/



```
$ export JAVA_HOME=/usr/lib/jvm/openjdk-18/
```

build
```
$ ./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=spring-k8s/gs-spring-boot-k8s
$ docker images spring-k8s/gs-spring-boot-k8s
```

run
```
$ docker run -p 8080:8080 --name gs-spring-boot-k8s -t spring-k8s/gs-spring-boot-k8s
```

check
```
curl http://localhost:8080/actuator/health;
```

stop 
```
docker stop gs-spring-boot-k8s
```


# kubernetes

generate descriptor
```
$ mkdir k8s
$ kubectl create deployment gs-spring-boot-k8s --image spring-k8s/gs-spring-boot-k8s:snapshot -o yaml --dry-run=client > k8s/deployment.yaml
$ kubectl create service clusterip gs-spring-boot-k8s --tcp 80:8080 -o yaml --dry-run=client > k8s/service.yaml
$ docker tag spring-k8s/gs-spring-boot-k8s spring-k8s/gs-spring-boot-k8s:snapshot
$ kind load docker-image spring-k8s/gs-spring-boot-k8s:snapshot
```

apply
```
$ kubectl apply -f ./k8s
$ kubectl port-forward svc/gs-spring-boot-k8s 9090:80
```

verify
```
$ kubectl get all
$ curl http://localhost:9090/actuator
$ curl http://localhost:9090/actuator/env
```


```
$ kubectl create configmap gs-spring-boot-k8s --from-file=./k8s/application.propertie
$ kubectl get configmap gs-spring-boot-k8s -o yaml
```
