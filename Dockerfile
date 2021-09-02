FROM ubuntu:latest

LABEL org.salambasha.image.authors="mitbashaee@gmail.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

#ENV version=docker

WORKDIR /usr/local/bin/

ADD target/Medicare-app.jar .

# CMD ["/bin/bash"]
 

ENTRYPOINT ["java", "-jar", "Medicare-app.jar"]