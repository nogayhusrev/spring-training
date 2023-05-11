#Base Image
FROM openjdk:17-jdk

#Will get jar file and copy to image
COPY ./target/spring-25-Docker-0.0.1-SNAPSHOT.jar /usr/app/

#To direct any folder
WORKDIR /usr/app

#Will provide executable application when container starts the run
ENTRYPOINT ["java", "-jar", "spring-25-Docker-0.0.1-SNAPSHOT.jar"]


