# inditest

## Manual installation and run

1. Clone project `git clone https://github.com/fjperezcostas/inditest.git`
2. Move into the project's folder `inditest/`
3. Package the project `mvn package`
4. Run jar file `java -jar target/inditest-1.0.jar`

## Run app using Docker

1. Move into the project's folder `inditest/`
2. Build docker image `docker build -t inditest .`
3. Run docker container `docker run -p 8080:8080 inditest`

## Run tests

`mvn clean verify`