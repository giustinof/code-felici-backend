# Stage 1: build con Maven + JDK 17
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copia pom.xml e scarica dipendenze (cache layer)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia tutto il codice
COPY src ./src

# Builda il jar senza test
RUN mvn clean package -DskipTests

# Stage 2: runtime leggero con JDK 17 Alpine
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copia il jar buildato dal primo stage
COPY --from=build /app/target/*.jar app.jar

# Esponi la porta 8080 (default Spring Boot)
EXPOSE 8080

# Comando per avviare l'app
CMD ["java", "-jar", "app.jar"]
