# Getting Started - BKN Config Server

### Reference Documentation
For further reference, please consider the following sections:

* [Docker Container's Architecture Diagram](https://github.com/fernandooliveira19/bookings-architecture-diagram) 

### Dependencies

Dependencies used in this project


* Actuator
* Eureka Client


### Docker's commands



create network

* $ docker network create bkn-net

clean and package

* $ .\mvnw clean package 

build docker image

* $ docker build -t bkn-config-server:v1 .

run docker container

* $ docker run -p 8888:8888 --name bkn-config-server --network bkn-net -e GITHUB_USER=${GITHUB_USER} -e GITHUB_PASSWORD=${GITHUB_PASSWORD} bkn-config-server:v1

