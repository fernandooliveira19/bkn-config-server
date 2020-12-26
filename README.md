# bkn-config-server

# Docker commands

$ cd ../../bkn-config-server

$ ./mvnw clean package

$ docker build -t bkn-config-server:v1 .

$ docker run -p 8888:8888 --name bkn-config-server --network bkn-net -e GITHUB_USER=${GITHUB_USER} -e GITHUB_PASSWORD=${GITHUB_PASSWORD} bkn-config-server:v1