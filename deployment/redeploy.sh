#!/bin/sh

docker pull chha25/personal:kotlin-playground
docker stop SAMPLE_APP
docker system prune -f
docker run -d --name=SAMPLE_APP -p 0.0.0.0:8080:8080 chha25/personal:kotlin-playground
