FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} contact.jar
RUN mvn package -DskipTests
ENTRYPOINT [ "java","-jar","/contact.jar" ]
EXPOSE 8282
