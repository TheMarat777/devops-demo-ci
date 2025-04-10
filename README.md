# DevOps Demo Project — DOC1 Assignment

Spring Boot + PostgreSQL project with full CI/CD pipeline using Docker, Kubernetes, Minikube, and GitHub Actions.

## Tech Stack
- Java 17 (Spring Boot)
- PostgreSQL
- Docker & Docker Compose
- Kubernetes (Minikube)
- GitHub Actions (CI/CD)

## Pipelines

### CI → .github/workflows/push_to_main.yml
- Run tests  
- Generate test coverage  
- Build & Push Docker image to GitHub Container Registry  

### CD → .github/workflows/pull_to_main.yml
- Deploy app to Minikube  
- Apply Kubernetes configs from k8s/  
- Rollout backend & database  

## Run Locally
docker-compose up --build

## Deploy to Minikube
minikube start  
eval $(minikube docker-env)  
docker build -t devops-demo-cd:v1.0.0 .  
kubectl apply -f k8s/  
kubectl get all  
