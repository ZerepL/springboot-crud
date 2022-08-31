FROM openjdk:11
MAINTAINER github.com/ZerepL
COPY target/crud-1.0.0.jar crud-1.0.0.jar
ENTRYPOINT ["java","-jar","/crud-1.0.0.jar"]