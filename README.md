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

Stworzenie kontenera na bazie mysql 5
```shell script
docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql:5.7
```
Podłączenie do kontenera
```shell script
docker exec -it some-mysql /bin/bash
```
Logowanie do kontenera
```shell script
mysql -uroot -ppassword
```

Stworzenie bazy danych w kontenerze
```shell script
create database northwind;
```

Plan
 - ipmelementacja aplikacji
 - stworzenie dokumentacji
 - przeprowadzenie testów wydajnościowych dla operacji:
    - dodawanie, modyfikacja i usuwanie danych na pojedyńczyj tablicy
    - tworzenie zamówienia
 
 
