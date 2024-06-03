FROM openjdk:17-alpine
COPY target/Practice-0.0.1-SNAPSHOT.jar Practice-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT [ "java","-jar","Practice-0.0.1-SNAPSHOT.jar" ]