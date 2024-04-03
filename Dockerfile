FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/Demo-0.0.1-SNAPSHOT.jar Demo.jar
ENTRYPOINT["java","-jar","Demo.jar"]