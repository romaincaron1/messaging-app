
# Messaging App

A messaging application made with Spring Boot, ReactJS using Kafka and STOMP.

## Usage

- Install all dependancies on the backend side and on the frontend side
- Run Kafka
- Run this command to simulate a message in the queue

```
curl -X POST -H "Content-Type: application/json" -d "{\"type\":\"CONNECT\",\"content\":\"Hello, World!\",\"sender\":\"Command Line\"}" http://localhost:8080/send
```


## Demo

![demo image](https://image.noelshack.com/fichiers/2024/21/6/1716597822-capture-d-e-cran-2024-05-25-a-02-43-30.png)

