# RESTful сервис

RESTful сервис - это веб-сервис, который следует архитектурному стилю REST. Он используется для взаимодействия между клиентами и серверами через HTTP.
В данном проекте реализован простейший RESTful сервис с Query Parameters и Path Parameters, который показывает как обрабтываются GET запросы.

## Технологии

* **Язык программирования**: Java 17
* **Фреймворк**: Spring Boot 3.x
* **Сборка**: Maven

## Установка и запуск

### Требования

* Установленная Java 17+
* Установленный Maven

## SonarCloud

[Sonar](https://sonarcloud.io/project/overview?id=dispronesson_rest-service)

## Шаги для запуска

```bash
git clone https://github.com/dispronesson/rest-service.git
cd rest-service
mvn clean install
mvn spring-boot:run
