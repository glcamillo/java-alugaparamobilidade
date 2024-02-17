FROM ubuntu:latest
LABEL authors="cirrus"

ENTRYPOINT ["top", "-b"]

version: '3'
services:
  db:
    image: postgres:14.1-alpine
    container_name: postgres
    restart: always
    environment:
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=postgres
    ports:
      - '9432:5432'
    volumes:
      - db:/var/lib/postgresql/data

volumes:
  db:
    driver: local
