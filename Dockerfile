FROM maven:3.9.4-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM maven:3.9.4-eclipse-temurin-17-slim
COPY --from=build /target/chatroom-jar.jar demo.jar
EXPOSE 8080
ENTRYPOINT [ "java" , "-jar" , "demo.jar" ]