FROM openjdk:18
EXPOSE 8080
ADD target/springdemo-0.0.1-SNAPSHOT.jar jarfile
ENTRYPOINT ["java","-jar","/jarfile"]