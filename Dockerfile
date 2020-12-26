FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/bkn-config-server-0.0.1-SNAPSHOT.jar bkn-config-server.jar
ENTRYPOINT ["java","-jar","/bkn-config-server.jar"]