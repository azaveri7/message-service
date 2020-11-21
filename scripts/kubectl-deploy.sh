#!/usr/bin/env bash
kubectl delete -f deployment-config.yaml
kubectl create -f deployment-config.yaml
