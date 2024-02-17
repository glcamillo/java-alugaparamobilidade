# java-alugaparamobilidade
Projeto disciplina Programação Web I que tem objetivo de implementar locação de veículos numa arquitetura REST usando Spring Boot.  Exercício: implementar consulta de veículos com base na placa.

## Programa: Ada Tech 50+
### Curso: Programação Web I
### Prof.:  Alex Araujo 

## Projeto
- Finalidade: implementar locação de veículos.
- Linguagem base: Java
- Arquitetura de serviço REST.
- Framework base: [Spring Boot](https://spring.io/projects/spring-boot)
- Persistência: Banco de Dados relacional [PostgreSQL](https://www.postgresql.org)
- Framework para persistência: [Spring Data (JPA)](https://spring.io/projects/spring-data)

Obs.: arquitetura base desenvolvida em aula e estendida para acomodar os seguintes recursos:
- Resolução do exercício
- Docker para implantação do banco de dados PostgreSQL
- [Docker Swarm](https://docs.docker.com/engine/swarm/) para implementar de forma segura os valores de segredos (principalmente senhas).

## Exercício
Implementar a consulta de veiculo, atraves da placa.

Endereço da branch com o código do projeto em aula: https://github.com/alexsaspbr/turma-1076/tree/aula-jpa

### Disclaimer
*As informações neste Readme.md não são ajuda para o projeto em si, mas para documentar questões, problemas e algumas soluções que surgiram durante o desenvolvimento e aperfeiçoamento.*

## Frameworks e dependências

Dependências incluídas no pom.xml

https://mvnrepository.com/artifact/org.postgresql/postgresql

Retorno do endpoint de criação:

JSON (biblioteca [Jackson](https://github.com/FasterXML/jackson)): "Jackson has been known as "the Java JSON library" or "the best JSON parser for Java". Or simply as "JSON for Java".
"

## VeiculoRestController

Classe que irá tratar as requisições HTTP.

Anotação: @RestController

## Como testar

POST http://localhost:8082/veiculo/criar
```json
{
  "placa": "XXX0ABC",
  "classeCarro": "Compacto",
  "tipo": "hatch",
  "modelo": "Argo",
  "fabricante": "Fiat",
  "quilometragem": 10000,
  "disponivel": true
}
```
Obs.:
a) Atributo classeCarro: compacto, compacto elétrico, econômico, executivo, suv
b) Atributo tipo: hatch, sedan, suv
c) A operação de salvar pode ser:
- Alteração de um objeto no BD se requisição vier **com ID**;ou
- Criação de um novo objeto no BD se requisição **não incluir ID**.
d) Não usar dado de ID para buscas pois expõe dados privados de banco. No caso de veículo, pode ser a chave FORTE placa

## Persistência e banco de dados PostgreSQL

A persistência foi definida usando o BD Relacional PostgreSQL. Foi instalado como um container Docker, conforme informação a seguir.

### Conectividade
Através de URL: jdbc:postgresql://localhost:8432/alugaparamobilidade

Então, como configuração de banco de dados, tem-se:
- Porta do servidor exposta: **8432**
- Nome da base de dados: **alugaparamobilidade**
- Nome de usuário para gerenciar essa base de dados: **uforadaprog** (atributos: Create DB)
- 

Instalação do docker
docker ps
CONTAINER ID   IMAGE             COMMAND                  CREATED        STATUS        PORTS                                       NAMES
182bbbcf8fc3   tomcat            "catalina.sh run"        23 hours ago   Up 23 hours   0.0.0.0:8888->8080/tcp, :::8888->8080/tcp   competent_gates
a3b476fa7f18   postgres:latest   "docker-entrypoint.s…"   32 hours ago   Up 32 hours   5432/tcp                                    postgresql_postgres.1.ccrzmbr3snqwbzw27mnmf24a5

```shell
docker exec -it ID_DO_CONTAINER psql -U postgres
```
Obs.:
a) Questão do nome dos atributos de classe e do nome da coluna. Como SQL é case-insensitive, nomes são vertidos de forma automática, como o exemplo a seguir:
```java
private String classeCarro;
```
Para
```roomsql
classe_carro varchar(255)
```
Desta forma, foram definidos de forma estática os parâmetros para nomes de colunas na classe Veículo através da anotação @Column.
```java
 @Column(name="classe_carro", nullable=true, insertable = true, length = 255)
```
Obs.: **nullable** é true por padrão; **insertable** também é true por padrão; length também tem tamanho padrão 255.

[Criar e realçar blocos de código](https://docs.github.com/pt/get-started/writing-on-github/working-with-advanced-formatting/creating-and-highlighting-code-blocks)
