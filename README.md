# 🚀 DevOps Demo CI

[![CI](https://github.com/TheMarat777/devops-demo-ci/actions/workflows/ci.yml/badge.svg)](https://github.com/TheMarat777/devops-demo-ci/actions/workflows/ci.yml)

A lightweight Spring Boot project demonstrating modern DevOps practices — including CI/CD, testing, code coverage, and Docker-based deployment.

## 🛠 Tech Stack

- Java 21 with Spring Boot  
- Maven  
- Docker  
- GitHub Actions (CI/CD)  
- JaCoCo (test coverage)  
- Render (cloud deployment)

## 📦 API Endpoint

```http
GET /members/{memberId}/tasks/{taskId}
```

### Example:

```bash
curl https://devops-demo-f8om.onrender.com/members/Member1/tasks/Task1
```

## 🧪 Running & Testing Locally

To run the app locally:

```bash
./mvnw spring-boot:run
```

To run tests and generate the code coverage report:

```bash
./mvnw test
./mvnw jacoco:report
```

Then open the coverage report in a browser:

```
target/site/jacoco/index.html
```

## 🐳 Docker

To build and run the app using Docker:

```bash
docker build -t devops-demo .
docker run -p 8080:8080 devops-demo
```

## ⚙️ CI/CD

This project uses GitHub Actions to automatically:

- Run tests on each push to the `main` branch
- Generate a code coverage report with JaCoCo

Workflow file: `.github/workflows/ci.yml`

## 🌍 Live Demo

App is deployed on **Render** and available here:  
🔗 https://devops-demo-f8om.onrender.com

