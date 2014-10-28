1. cd to repo
2. mvn clean install
3. install neo-4j
4. copy jar from maven compilation to neo4j/plugin
5. copy the following jars from target/alternativeLocations to neo4j/lib (if they aren't there don't worry about them)
aopalliance-1.0.jar
aopalliance-repackaged-2.3.0-b05.jar
guava-17.0.jar
hamcrest-core-1.3.jar
hk2-api-2.3.0-b05.jar
hk2-locator-2.3.0-b05.jar
hk2-utils-2.3.0-b05.jar
jackson-annotations-2.3.2.jar
jackson-core-2.3.3.jar
jackson-databind-2.3.3.jar
jackson-jaxrs-base-2.3.2.jar
jackson-jaxrs-json-provider-2.3.2.jar
jackson-module-jaxb-annotations-2.3.2.jar
javassist-3.18.1-GA.jar
javax.annotation-api-1.2.jar
javax.inject-2.3.0-b05.jar
javax.ws.rs-api-2.0.jar
jersey-client-2.9.jar
jersey-common-2.9.jar
jersey-container-servlet-core-2.9.jar
jersey-guava-2.9.jar
jersey-media-json-jackson-2.9.jar
jersey-server-2.9.jar
jul-to-slf4j-1.7.4.jar
osgi-resource-locator-1.0.1.jar
spring-aop-4.0.5.RELEASE.jar
spring-beans-4.0.5.RELEASE.jar
spring-context-4.0.5.RELEASE.jar
spring-core-4.0.5.RELEASE.jar
spring-expression-4.0.5.RELEASE.jar
validation-api-1.1.0.Final.jar
6. Start neo4j
