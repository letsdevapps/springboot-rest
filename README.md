# Springboot Rest

![GitHub release](https://img.shields.io/github/v/release/letsdevapps/springboot-rest)
![GitHub last commit](https://img.shields.io/github/last-commit/letsdevapps/springboot-rest)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/letsdevapps/springboot-rest/build-ci.yml)

## Docker

    docker build -t springboot-rest .
    
    docker run --rm -p 8080:8080 --name springboot-rest springboot-rest 

## Api

    /api/home
    /api/home/lorem-ipsum
    /api/home/get-int
    /api/home/get-int-param (@RequestParam int val)
    /api/home/get-date
    /api/home/get-date-param (@RequestParam String dat)

    /api/product
    /api/product/prod
    /api/product/prod-list

