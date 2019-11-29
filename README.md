Operacje bazodanowe z wykorzystaniem bazy Northwind

Autorzy
 - Hubert Makuła makula.hubert@gmail.com
 - Dawid Pietruszka dawpietr@gmail.com
 - Filip Otrębski filipotrebski@poczta.onet.pl
 

Technologie
 - Java 8
 - Maven
 - MySql
 - Hibernate
 - Docker
 - Gatling
 - Swagger

Uruchamianie bazy przy pomocy docker'a
```shell script
docker run --rm --name some-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql:5.7
```

Plan
 - ipmelementacja aplikacji
 - stworzenie dokumentacji
 - przeprowadzenie testów wydajnościowych dla operacji:
    - dodawanie, modyfikacja i usuwanie danych na pojedyńczyj tablicy
    - tworzenie zamówienia
 
 
