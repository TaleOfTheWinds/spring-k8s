./mvnw clean package
docker build . -t gamerivan/spring-k8s:1.0.0
docker push gamerivan/spring-k8s:1.0.0
cmd /k