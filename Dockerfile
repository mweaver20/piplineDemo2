FROM openjdk:8
ADD target/moPipeline.jar moPipeline.jar
ENTRYPOINT ["java", "-jar","moPipeline.jar"]
EXPOSE 8080