FROM openjdk:8
ADD target/ServiceRegistry.jar ServiceRegistry.jar
EXPOSE 8070
ENTRYPOINT ["java","-jar","ServiceRegistry.jar"]