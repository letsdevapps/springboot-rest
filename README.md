# Springboot Rest

![GitHub release](https://img.shields.io/github/v/release/letsdevapps/springboot-rest)
![GitHub last commit](https://img.shields.io/github/last-commit/letsdevapps/springboot-rest)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/letsdevapps/springboot-rest/build-ci.yml?label=status%20integration)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/letsdevapps/springboot-rest/build-cd.yml?label=status%20deployment)

![Java](https://img.shields.io/badge/java-21+-brightgreen)
![Springboot](https://img.shields.io/badge/springboot-3+-brightgreen)
![JUnit](https://img.shields.io/badge/junit-enabled-blue)

![Docker](https://img.shields.io/badge/docker-enabled-blue)
![CI](https://img.shields.io/badge/ci-enabled-blue)
![CD](https://img.shields.io/badge/cd-enabled-blue)
![Kubernetes](https://img.shields.io/badge/kubernetes-enabled-blue)
![Terraform](https://img.shields.io/badge/terraform-enabled-blue)
![Status](https://img.shields.io/badge/status-active-success)

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

## Terraform

Verificar se Minikube esta rodando

	minikube status

Verificar se Ingress esta ativo no Minikube

	minikube addons list
	
	minikube addons enable ingress

Entrar na pasta `terraform` e inicializar

	cd terraform
	
	terraform init

	terraform plan

Executar o setup

	terraform apply

Apagar o setup

	terraform destroy

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