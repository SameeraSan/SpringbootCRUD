### START

## Simple CRUD Service
---

# Project Instructions

### Requirements

- Java 17
- IDE (IntelliJ)
- H2 in memory database
- Test tool (Postman)
---

#### How to build

- Clone the Main branch from  GIT - https://github.com/SameeraSan/SpringbootCRUD.git
- Import the project to intelliJ
- Configure the application.properties (refer application.property Configure section)
- Update Maven
- Maven build

### application.property Configure

- server.port=7661
- H2 Database config

> 
### Once you complete the configuring project you can run the project 
> To run the project you can use either the IDE or the provided docker image, below you can find the docker run instructions
>
--- 

### Assumptions
- Simple application which requires only basic CRUD functions
- No Security mechanism implemented 
- No container or deployment mechanism
- No advisors for exception handling
- No production ready
- No unit test since limited time (please inform if unit testing is needed )
- Single table created with id(pk),name,age

---

### How Test the services

- Requests MediaType: **APPLICATION_JSON**
- Responses MediaType: **APPLICATION_JSON**

#### Create resources
- url (Post) - **http://localhost:7661/v1/crud/create**
> Request : {
"id":1,
"name":"sam",
"age":25
}
> Response : {
"message": "Resource created, id : 1"
}
#### Get resource by id
- Url (Get) = **http://localhost:7661/v1/crud/read/1**

> Response : {
"message": "Response for id : 1",
"resource": {
"id": 1,
"name": "sad",
"age": 25
}
}
> 
#### Get resource list
- url (Get) - **localhost:5559/v1/drone/available/**
- > Respinse : {
  "message": "Load all Responses",
  "resourceList": [
  {
  "id": 1,
  "name": "sad",
  "age": 25
  },
  {
  "id": 2,
  "name": "sam",
  "age": 25
  }
  ]
  }
  >
> 
#### Update a resources
- url (patch) - **http://localhost:7661/v1/crud/update**
> Request : {
"id":"1",
"name":"minus"
}
> Response : {
"message": "Resource updated"
}
> 
#### Delete a resources
- url (delete) - **http://localhost:7661/v1/crud/delete**
> Request : {
"id":"2"
}
> Response : {
"message": "Resource deleted"
}
> 
---

### END