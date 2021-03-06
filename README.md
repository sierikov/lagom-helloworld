# Lagom template

![Lagom Hello World](https://repository-images.githubusercontent.com/272716692/5b2ee300-aff1-11ea-8da9-30963687b8a2)

## Inlcudes:
 - Maven Project configuration
 - Example of definition API for a Lagom Service
 - Example implementation of Lagom Service
 - Example of wiring application with Guice
 - Example Usage of the Lagom Service Client
 
### Not perfect
 
This repository contains basic example of END-to-END microservice application.
You can improve it by adding following, if you need:
 - Streaming APIs
 - Persistent Entities
 - Message Broker
 - etc.
  
  
## Request path
  
This is step-based-description how request goes:
 1. Client
 2. API
 3. Choosing Implementation defined in Guice
 4. Implementation Call. 
   
   
## Services
   
### Services
   
| Service                 | Location                  |
|-------------------------|:-------------------------:|
| `hello-world` locator   |   http://127.0.0.1:9008   |
| `hello-world` gateway   |   http://127.0.0.1:9000   |
| `hello-world-impl`      |   http://127.0.0.1:53713  |
   
### Endpoints
| Endpoint         | Response Type  |
|------------------|:--------------:|
| `/hello-world`   |   String       |
   
If you call 
 - http://127.0.0.1:9000/hello-world or
 - http://127.0.0.1:53713/hello-world 
 
you'll get the same `Hello World` result.

## Test & Run

### Test

```
mvn test
```

### Run

```
mvn lagom:runAll
```
