# springboot-crud

Just an app in Java using Spring Boot in order to study.

## Requirements

### Standalone

* [PostgreSQL](https://www.postgresql.org/)
* [Maven](https://maven.apache.org/)

### Running a container

* [Docker](https://docs.docker.com/get-docker/)
* [PostgreSQL Image](https://hub.docker.com/_/postgres)
* [Maven](https://maven.apache.org/install.html)

### Creating the container

While the same folder of Dockerfile, run:

``` shell
mvn clean package
docker build --tag java-crud:latest .
```

## Running

``` shell
mvn clean package

java -jar target/crud-1.0.0.jar
```

### Running as container

Starting MySQL container:

``` shell
docker run --name postgres --network host -e POSTGRES_PASSWORD=admin -d postgres:latest
```

Starting the app

``` shell
docker run -ti --network host java-crud:latest
```

## API

~~Inside [docs](https://github.com/ZerepL/springboot-crud) you can find a swagger file with all details about API.~~ TBD

### /employees/

|     Function     | Method  |  Path  | Expected  |
|:----------------:|:-------:|:------:|:---------:|
|   Get Employee   |   GET   | /{id}  |    Int    |
| Create Employee  |  POST   |   /    |   JSON    |
| Update Employee  |   PUT   | /{id}  |   JSON    |
|  Patch Employee  |  Patch  | /{id}  |   JSON    |
| Delete Employee  | DELETE  | /{id}  |    Int    |


# TODO

Create deployment file
Reduce Docker image size
Include Swagger file