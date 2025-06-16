# TechSpark Product API

TechSpark Product API is a Spring Boot application that provides a RESTful API for managing product information.
This project serves as a starter template for building Spring Boot applications with essential features and best
practices.

## Service Features

This service comes with below features.

- Spring Boot Web, Validation, JPA, and Actuator
- SpringDoc OpenAPI with Swagger UI
- Lombok for reducing boilerplate code
- MapStruct for DTO-to-Entity conversion
- H2 In-Memory Database for testing
- Stock Portfolio CRUD with Service, Repo, Controller
- Global Exception Handling with @ControllerAdvice
- JUnit 5 & Mockito for unit testing
- Feature-based folder structure

## Clone this Repository

Run ```git clone git@github.com:TechSparkWorkspace/tspark-product-api.git``` to clone the repository to your local
machine.

## Build and Run the Application

```shell
./gradlew build bootRun
```

Open your browser and goto [API Documentation](http://localhost:8080/swagger-ui/index.html)

- Access the running application by opening your browser at http://localhost:8080 (unless you changed the port).

## Build and Test Using Docker Locally

```shell
docker build -t tspark-product-api .
docker run -d -p 8080:8080 --name product-api tspark-product-api
```

Test: http://localhost:8080/api/products

## Push Image to GCP

```shell
gcloud builds submit --tag gcr.io/tspark-product-ui/tspark-product-api
```

## Deploy the container to Cloud Run

```shell
gcloud run deploy tspark-product-api \
  --image gcr.io/tspark-product-ui/tspark-product-api \
  --platform managed \
  --region us-central1 \
  --allow-unauthenticated
```