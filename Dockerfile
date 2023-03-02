FROM openjdk:8
ADD target/moProject.jar moProject.jar
ENTRYPOINT ["java", "-jar","moProject.jar"]
EXPOSE 8080