

FROM openjdk:8-jdk-alpine

# Add Maintainer Info
MAINTAINER SALAM BASHA A <mitbashaeee@gmail.com>

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
#ARG JAR_FILE=target/Medicare-0.0.1-SNAPSHOT.jar

ADD target/Medicare-app.jar .

#CMD ["/bin/bash"]

# Add the application's jar to the container
#ADD ${JAR_FILE} Medicare.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","Medicare.jar"]
