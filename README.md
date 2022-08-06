# spring-cloud-function 

* Add following dependency to pom.xml

```
    <properties>
        <spring-cloud.version>2021.0.3</spring-cloud.version>
    </properties>
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-function-web -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-function-web</artifactId>
            <version>1.0.0.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-function-compiler -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-function-compiler</artifactId>
            <version>3.0.14.RELEASE</version>
        </dependency>
    </dependencies>
        
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

* To use spring cloud function, create funtional method in class with @Bean annotation.
* Run the application
* Go to the project path and run the command to run execute reverse endpoint. Here the function name is the endpoint name.
    > curl -H "Content-Type: text/plain" localhost:8080/reverse -d Rajeev

* Go to the project path and run the command to run execute getBook endpoint. Here the function name is the endpoint name.Here we need to change content type to applicaion/json because it return json output and there is no input so no need of -d. 
  > curl -H "Content-Type: application/json" localhost:8080/getBook

* Go to the project path and run the command to run execute printMessage endpoint. Here the function name is the endpoint name. In this method the output is printed on console.
  > curl -H "Content-Type: text/plain" localhost:8080/printMessage -d message
  
* If we don't want to annotate @Bean to each endpoint we can create a class  and implements it as one of the functional Interface. In our case we have create a Test class and implements Function as functional interfacce. We can do for supplier, Consumer or Predicate too.
* To tell spring conext to scan the class we need to set property in application.properties.
* Then we can access Test class as rest end point.
* Go to the project path and run the command to run execute test endpoint. Here the class name is the endpoint name.
  > curl -H "Content-Type: text/plain" localhost:8080/test -d TestClass