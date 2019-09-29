FROM openjdk:8
EXPOSE 8080
ADD target/spring-dockerize.jar spring-dockerize.jar
ENTRYPOINT ["java","-jar","/spring-dockerize.jar"]