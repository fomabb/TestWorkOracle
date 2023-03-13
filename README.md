# TestWorkOracle
# RESTful Web-application is written using the following technologies: 
  - Maven 
  - Hibernate ORM
  - Oracle DB 
  - Spring Boot
  
### Short description of the project
  - Standalone application providing REST API

### Prerequisites:
- Java 19
- PostgresSQL

# Data model
## ER diagram for the data model

//![redm_db.png](src/main/resources/img/readme_db.png)

## RESTful API

**1. API Description of general methods for Goods**

METHOD | PATH | DESCRIPTION
------------|-----|------------
POST | /api/goods/save      | create new goods (List)
PUT  | /api/goods/update    | update quantity
GET  | /api/goods/order/all | get all orders with goods
GET  | /api/goods/all       | get available goods
GET  | /api/goods/{id}      | get goots by id
GET  | /api/search          | get goots by good_code

**2. API Description of general methods for Orders**

METHOD | PATH               | DESCRIPTION
------------|--------------------|------------
POST | /api/save/order                          | create new order
PUT | /api/add/order/{orderId}/goods/{goodsId}  | add goods to order
GET | /api/order/{id}                           | get order by id
GET | /api/orders                               | get all orders
DEL | /api/delete/order/{id}                    | delete order by id


### My application requests in Postman
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/d9af219fea3fe665c736?action=collection%2Fimport)
