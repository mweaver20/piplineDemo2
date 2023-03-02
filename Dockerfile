FROM openjdk:8
ADD target/mo-pipeline.jar mo-pipeline.jar
ENTRYPOINT ["java", "-jar","mo-pipeline.jar"]
EXPOSE 8080