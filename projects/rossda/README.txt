Dominion Info
The Dominion folder provided is a Maven Project. All that should be neccesary in order to run it is the following (executed in the same directory as pom.xml)
mvn test
if this doesn't work however it should after this sequence of commands
mvn clean
mvn compile
mvn test

If you want to run PITest it's already included in the pom.xml so it's just
mvn org.pitest:pitest-maven:mutationCoverage
