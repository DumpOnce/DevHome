FROM openjdk:8
EXPOSE 8082
ADD target/Spring-boot-docker.jar Spring-boot-docker.jar
ENTRYPOINT ["java","-jar","Spring-boot-docker.jar"]
