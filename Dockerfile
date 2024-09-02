FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/malachite-be-0.0.1-SNAPSHOT.jar malachite-be.jar
EXPOSE 8093
ENTRYPOINT ["java","-jar","malachite-be.jar"]

