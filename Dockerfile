## https://spring.io/guides/gs/spring-boot-docker/
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG jar_file=target/*.jar
COPY ${jar_file} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]