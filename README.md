Automated UI tests for verifying popup banner functionality using Selenide and Docker.

## Prerequisites

- Java 17 or higher
- Gradle 7.6+
- Docker (optional, for containerized execution)

# Financial Freedom Tests

## Local Run
`./gradlew clean test` - run tests on local machine

## Docker Run  
`docker build -t selenide-tests .` - build Docker image  
`docker run --rm --shm-size=2g selenide-tests` - run tests in container

## View Results
`build/reports/tests/test/index.html` - view test results report
