FROM alpine:latest

RUN apk add openjdk17
COPY target/spring-boot-k8s-3.3.4.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]