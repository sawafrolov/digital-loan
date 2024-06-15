FROM openjdk:17-slim

RUN apt-get update && apt-get install curl -y

ENV APPLICATION_USER spring
RUN useradd $APPLICATION_USER

RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

COPY ./build/libs/loan-request-service-?.?.?.jar /app/loan-request-service.jar
WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "loan-request-service.jar"]
