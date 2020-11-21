#!/usr/bin/env bash
aws ecr get-login-password --region us-east-2 | docker login --username AWS --password-stdin 615360450654.dkr.ecr.us-east-2.amazonaws.com
cd ../..
docker build -t message-service:latest  --file Dockerfile .
docker tag message-service:latest 615360450654.dkr.ecr.us-east-2.amazonaws.com/message-service:latest
docker push 615360450654.dkr.ecr.us-east-2.amazonaws.com/message-service:latest