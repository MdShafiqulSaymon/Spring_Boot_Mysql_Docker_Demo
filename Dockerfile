FROM openjdk:17-oracle
COPY target/demo.jar .
EXPOSE 8080

ENTRYPOINT ["java","-jar","demo.jar"]