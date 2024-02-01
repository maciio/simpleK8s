# Simple K8s app

## Description
This app is a super simple integration with minikube and Springboot with java 21 with gradle 

## Requirements
    - Gradle 8.5+
    - Java 21
    - Docker
    - Minikube/kubectl

## Installation
 - Build and create java app with gradle  ``gradle clean build``
 - Make sure have Minikube installed and running ``minikube status``
 - We need to tell Minikube to read our local image (Mac OS): ``eval $(minikube -p minikube docker-env)``
 - Make sure have Docker installed and running; create local image ``docker build -t simple-k8s . ``

## Deployment & Testing 
- At root level use ``kubectl apply -f deployment.yam``
- Check for pods and deployments ``kubectl get all``
- Once *simple-k8s-service* up open tunnel ``minikube service simple-k8s-service`` the output url and */controller*
  to test out. 