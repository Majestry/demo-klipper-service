FROM eclipse-temurin:17-jdk-alpine
EXPOSE 80
WORKDIR /opt/app/
COPY ./target/*.jar klipper.jar
ENTRYPOINT ["java", "-jar", "klipper.jar"]