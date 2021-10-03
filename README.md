# Product Management Application with Spring Boot, Mysql, JPA and Hibernate 

## Steps to Setup

**1. Clone the application**


https://github.com/Richa-rani02/Product-management-system.git


**2. Create Mysql database**

create database springboot_crud


**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**


mvn package
java -jar target/spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar



Alternatively, you can run the app without packaging it using -


mvn spring-boot:run


The app will start running at <http://localhost:8082> (as in application.properties file server.port is mentioned as 8082)
