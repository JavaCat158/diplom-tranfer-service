FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/task-0.0.1-SNAPSHOT.jar mtransfer.jar
ENTRYPOINT ["java","-jar","mtransfer.jar"]