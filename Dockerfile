FROM openjdk:11
ADD target/springBoot-RestApi.jar springBoot-RestApi.jar
 
ENTRYPOINT ["java", "-jar", "springBoot-RestApi.jar"]