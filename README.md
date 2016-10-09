# microservice-zuul
Zuul sample edge service with eureka, ribbon and spring boot admin


This project is compoused of five maven modules: First of all launch mvn clean install

Eureka Server

start this module with mvn spring-boot:run Running on port 1111 After that you can see the eureka dashboard on http://localhost:1111

Car Microservice

start this module with mvn spring-boot:run Running on port 2222 After that you can test the microservi with the next url http://localhost:2222/car/3

Microservice Client

start this module with mvn spring-boot:run Running on port 8082 After that you can test the microservice with the next url http://localhost:8082/client-car/3

Microservice Admin Dashboard

start this module with mvn spring-boot:run Running on port 8081 After that you can test the dashboard of spring boot admin with the next url http://localhost:8080

Now run zuul microservice

start this module with mvn spring-boot:run Running on port 8080
Now zuul go to redirect every request that cotaint /car/** to the client
To access to car microservice use now this url: http://localhost:8080/car/client-car/3
