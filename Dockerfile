# Stage 1: Build the app
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copy Gradle Wrapper files first — this caches them for faster builds
COPY gradlew .
COPY gradle gradle

# Make gradlew executable
RUN chmod +x gradlew

COPY . .
RUN ./gradlew bootJar

# Stage 2: Run the app
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]