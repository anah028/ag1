FROM amazoncorretto:17
MAINTAINER AG
COPY target/ag-0.0.1-SNAPSHOT.jar  ag-app.jar
ENTRYPOINT ["java","-jar","/ag-app.jar"]
EXPOSE 8080