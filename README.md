# Sleuth lettuce propagation test

1. Execute `docker-compose up` at the project root to setup redis and zipkin.
2. Start the SpringBootApplication
3. Execute `curl localhost:9090/ping`
4. Check out the zipkin.(localhost:19411)

## Environment

- Java 1.8.0_201

### Dependencies

#### Versions

- Spring Boot 2.5.3
- Spring Cloud 2020.0.3

#### Libraries

- org.springframework.boot:spring-boot-starter-webflux
- org.springframework.boot:spring-boot-starter-data-redis-reactive
- io.projectreactor.kotlin:reactor-kotlin-extensions
- org.jetbrains.kotlin:kotlin-reflect
- org.jetbrains.kotlin:kotlin-stdlib-jdk8
- org.jetbrains.kotlinx:kotlinx-coroutines-reactor
- org.springframework.cloud:spring-cloud-sleuth-zipkin
- org.springframework.cloud:spring-cloud-starter-sleuth
