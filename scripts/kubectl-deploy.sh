#!/usr/bin/env bash
kubectl delete -f deployment-config.yaml
kubectl create -f deployment-config.yaml
kubectl port-forward svc/message-service-svc 8082:8082
#kubectl delete -f deploy-message-service.yaml