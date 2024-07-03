#!/bin/bash

# Health check script for your Spring Boot application

response=$(curl --write-out '%{http_code}' --silent --output /dev/null http://localhost:8081/actuator/health)

if [ "$response" -eq 200 ]; then
  echo "Application is healthy"
  exit 0
else
  echo "Application is not healthy"
  exit 1
fi
