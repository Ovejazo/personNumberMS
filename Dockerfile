FROM openjdk:17
ARG JAR_FILE=./target7*.jar
COPY ${JAR_FILE} personNumberMS.jar
ENTRYPOINT ["java", "-jar", "/personNumberMS.jar"]