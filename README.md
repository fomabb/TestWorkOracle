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
- Oracle

# Data model
## ER diagram for the data model

![db_diagram.png](src%2Fmain%2Fresources%2Fimg%2Fdb_diagram.png)

# response.json{}
## Order register

![responseJson.png](src%2Fmain%2Fresources%2Fimg%2FresponseJson.png)

# Postman collection
## {Json}
[oracle_test.postman_collection.json](src%2Fmain%2Fresources%2Ffiles%2Foracle_test.postman_collection.json)

## RESTful API

**1. API Description of general methods for Goods**

METHOD | PATH | DESCRIPTION
------------|-----|------------
POST | /api/goods/save      | create new goods (List)
PUT  | /api/goods/update/quantity/{id}    | update quantity by id goods (quantity + 1 = price++; if quantity < 0 is using method remove from order)
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
GET | /api/orders/all/{id}                      | get all goods in orders by id
GET | /api/registry/{id}                        | get registry by order id
DEL | /api/delete/order/{id}                    | delete order by id


### My application requests in Postman
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/d9af219fea3fe665c736?action=collection%2Fimport)
