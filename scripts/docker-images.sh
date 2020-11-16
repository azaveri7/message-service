#!/usr/bin/env bash
cd ..
docker build -t message-service:latest .
docker tag message-service:latest azaveri7/microservices:message-service
docker push azaveri7/microservices:message-service
