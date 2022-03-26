FROM jdk-11.0.10.9-hotspot

COPY target/untitled.jar /demo.jar

CMD ["java","-jar","/demo.jar"]