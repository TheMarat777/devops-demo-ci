FROM maven:3.9.4-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
VOLUME /backend_volume
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
