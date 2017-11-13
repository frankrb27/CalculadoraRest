FROM gersua/openjdk8-ubuntu:latest
MAINTAINER Frank Rodriguez
ENV WORKSPACE /opt
WORKDIR ${WORKSPACE}
COPY target/calculadora-rest.jar .
ENTRYPOINT java -jar calculadora-rest.jar
