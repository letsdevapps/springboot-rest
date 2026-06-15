# Springboot Rest

![GitHub release](https://img.shields.io/github/v/release/letsdevapps/springboot-rest)
![GitHub last commit](https://img.shields.io/github/last-commit/letsdevapps/springboot-rest)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/letsdevapps/springboot-rest/build-ci.yml)

## Docker

    docker build -t springboot-rest .
    
    docker run --rm -it -p 8080:8080 --name springboot-rest springboot-rest

## Kubernetes (Minikube)

Como rodar

### 1. Subir o cluster
    
    minikube start

### 2. Habilitar Ingress

    minikube addons enable ingress

### 3. Build da imagem

    docker build -t springboot-rest:latest .

### 4. (ou) carregar no minikube

    minikube image load springboot-rest:latest

### 5. Aplicar manifests

    kubectl apply -f k8s/

### 6. Acessar

    minikube ip

    http://<minikube-ip>/spring

### Debug

    kubectl get pods
    kubectl get svc
    kubectl get ingress
    kubectl get endpoints

## API

Root Index

	localhost:8080/
	----- Springboot Rest | Home API | Root Index -----

Home API

    /api/home
    /api/home/lorem-ipsum
    /api/home/get-int
    /api/home/get-int-param (@RequestParam int val)
    /api/home/get-date
    /api/home/get-date-param (@RequestParam String dat)

Product API

    /api/product
    /api/product/prod
    /api/product/prod-list

### API Consume

Fiz uma camada de teste consumindo a propria API exposta
I created a test layer that consumes the API itself

	/api/consume
	
	/api/product/consume