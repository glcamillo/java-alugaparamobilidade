FROM ubuntu:latest
LABEL authors="gerson"

ENTRYPOINT ["top", "-b"]

version: '3.8'
services:
  postgres:
    image: postgres
    ports:
      - "8432:5432"
    secrets:
     - postgres_external_secret
    environment:
     - POSTGRES_USER=postgres
     - POSTGRES_PASSWORD_FILE=/run/secrets/postgres_external_secret
    volumes:
     - pgdata:/var/lib/postgresql/data
secrets:
  postgres_external_secret:
    external: true
volumes:
  pgdata:
    driver: local
