FROM ubuntu:18.04
#FROM openjdk:8-jre-slim

LABEL maintainer="Omniwyse.com"

COPY ./target/test-docker-0.0.1.jar /

WORKDIR /

EXPOSE 8081

CMD ["java", "-jar", "test-docker-0.0.1.jar"]
