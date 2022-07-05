FROM openjdk:11
RUN mvn package -DskipTests
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} contact.jar
ENTRYPOINT [ "java","-jar","/contact.jar" ]
EXPOSE 8282
