# DevOps Demo CI

This is a simple Spring Boot application that demonstrates basic DevOps practices. It includes unit testing, code coverage, a CI pipeline with GitHub Actions, and deployment using Docker on Render.

## Tech Stack

- Java 21 (Spring Boot)
- Maven
- Docker
- GitHub Actions
- JaCoCo (for test coverage)
- Render (for deployment)

## API

| Method | Endpoint                                  | Description                          |
|--------|-------------------------------------------|--------------------------------------|
| GET    | `/members/{memberId}/tasks/{taskId}`      | Returns a task by ID for a member    |

Example:

```bash
curl https://devops-demo-f8om.onrender.com/members/Member1/tasks/Task1

Running Locally

To run the app locally:

./mvnw spring-boot:run

Testing

Run tests and generate coverage report:

./mvnw test
./mvnw jacoco:report
Coverage report will be at:
target/site/jacoco/index.html

Docker

To build and run with Docker:

docker build -t devops-demo .
docker run -p 8080:8080 devops-demo
CI/CD

A GitHub Actions workflow is set up to run tests and generate code coverage on every push to the main branch.

Deployment

The app is deployed on Render:
👉 https://devops-demo-f8om.onrender.com

