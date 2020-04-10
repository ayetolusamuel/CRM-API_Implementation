Project : spring-boot-course
-----------------------------------------------
- Tech Stack
  - Mockaroo
  - myqsl -  Database.
  - Spring Data JPA - uses Hibernate as JPA implementation.
  - Swagger - used for Documenting Rest API’s.
- It is RESTful Web Service.
- Implemented CRUD operations.
- Github link : https://github.com/ayetolusamuel/spring-boot-course.git




### Video demo: https://www.youtube.com/watch?v=GqxUq3doGrU 


    
   #### Starting server[xamp]
  - launch xamp and start mysql and note the port.
            
            
 #### command to execute the jar file
- java -jar -Dserver.port=80 spring-boot-course.jar{jar path}
        
 #### compile the jar for deployment with maven
- run this command in terminal: mvn package spring-boot:repackage
        
        
        
 #### launch xamp and start mysql and note the port(3306).
        

Dependencies used
------------------------------------------------------
- `Spring Web `
- `springfox-swagger-ui : https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui`
- `springfox-swagger2 : https://mvnrepository.com/artifact/io.springfox/springfox-swagger2`
- `mysql`
-  `lombok`
-  `data-jpa`
    
- you can also see other dependenciew in `pom.xml` file.


Configuration in application.properties file
------------------------------------------------------
- `spring.datasource.url=jdbc:mysql://localhost:3306/customer_database useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC`
- `spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver`
- `spring.jpa.database-platform = org.hibernate.dialect.MySQL5Dialect`
- `spring.jpa.hibernate.ddl-auto = update`
-  `server.port = 8080`
    
- you can also see other properties in `application.properties` file.
        
Implementing mockaroo [for mock data]
--------------------------------------------------
- create custom SQL datasets to test and demo your software
- Download : https://www.mockaroo.com/
- after downloading execute with mysql workbench or any IDE to modify the query
- link to the sql: https://github.com/ayetolusamuel/spring-boot-course/blob/master/sql/customer.sql
 
 
  
