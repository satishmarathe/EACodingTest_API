# EACodingTest_API
This API is developed using 'Contract first approach'.

Swagger.yml file is present in the root which provides details of the API

Using Swagger code gen - server side jersey implementation has been implemented as a POC.

# Software versions required :
Maven 3.2.5+
JDK 1.7+

# To run this example:
Checkout project and then run the maven command:
mvn clean package jetty:run

This will start jetty on port : 9090
The API endpoint can then be accessed at : http://localhost:9090/api/v1/festivals

If this port is already in use please change the port in pom.xml 


# Rate Limit Implementation
This API is expected to respond with a 429 ( Throttled / Rate Limit response ) 
The condition on when this response is to be generated in this contrived example is as follows :
We allow 3 requests to succeed and subsequent request will be served this 429 error response.
Then the counter will be reset to 0 to allow next subsequent 3 requests to succeed and so on ...
This is obviously a contrived and rather simple basic implementation.

