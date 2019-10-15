# EACodingTest_API
This API is developed using 'Contract first approach'.

Swagger.yml file is present in the root which provides details of the API

Using Swagger code gen - server side jersey implementation has been implemented as a POC.

#Software versions required :
Maven 3.2.5+
JDK 1.7+

#To run this example:
Checkout project and then run the maven command:
mvn clean package jetty:run

This will start jetty on port : 9090
The API endpoint can then be accessed at : http://localhost:9090/api/v1/festivals

If this port is already in use please change the port in pom.xml 

