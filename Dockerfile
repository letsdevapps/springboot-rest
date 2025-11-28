FROM maven:latest

WORKDIR /app

COPY pom.xml .
COPY src /app/src

RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/pro-0.0.1-SNAPSHOT.jar"]
