# Stage 1: Build the JAR using Maven and JDK 17
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR using a lightweight JRE 17 image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/Student_Marks-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]