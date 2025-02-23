# Простейший REST сервис

Данный проект представляет простейший REST сервис, созданный с помощью Spring Boot. В проекте реализовано два GET ендпоинта с Query Parameters и Path Parameters.

## Установка

1. Установите Intellij IDEA Ultimate

2. Склонируйте репозиторий в `Git -> Clone...`

3. Запустите проект

Приложение будет доступно на `http://localhost:port` (по умолчанию, порт 8080).

## GET ендпоинт с Query Parameters

В адресной строке введите `http://localhost:8080/user`. Без каких либо передаваемых параметров, приложение вернет объект в виде JSON файла с полями по умолчанию.

![GET запрос без Query Parameter](/images/image1.png)

Передавая в адресную строку Query Parameters, возвращается объект с указанными параметрами. Пример: `http://localhost:8080/user?name=Alex&id=2`.

![GET запрос с Query Parameter](/images/image2.png)

## GET ендпоинт с Path Parameters

В адресной строке введите `http://localhost:8080/user/{id}`, где {id} - любое целое число. Приложение вернет объект с указанным id с именем по умолчанию.

![GET запрос с Path Parameters](/images/image3.png)
