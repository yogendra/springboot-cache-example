# Spring + Hazelcast Cache Demo
 
This project demonstrates use of cache in spring (and springboot). This project has 2 modules:
1. API module
2. Frontend module

## API Module

This module produces simple `Hello World!` test. There is no caching. Every call to the rest url `http://localhost:5000`
  will result in server sending this string back
  
## Frontend Module

This module is a client to API module. This module runs as a web service and listens on port 5001 (default). Server port
 can be chaged be providing `server.port` JVM argument or program argument.
 
# How to build?

Clone git repo and run gradle wrapper

```shell
git clone https://github.com/yogendra/springboot-cache-example.git
cd springboot-cache-example
./gradlew build
```

# How to run?

You can run both modules with simple `java` command

To run API module:

```shell
java -jar api/build/libs/api-1.0.0-SNAPSHOT.jar

```

To run Frontend module:

```shell
java -jar frontend/build/lib/frontend-1.0.0-SNAPSHOT.jar

# For subsequent instance

java -jar frontend/build/lib/frontend-1.0.0-SNAPSHOT.jar --server.port=5002
```

## Alternatively: use autoenv

Run API module:

```shell

api-start
```

Run frontend module:

```shell
frontend-start

# For subsequent instance

fronend-start --server.port=5002

```