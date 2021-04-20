FROM openjdk:11

EXPOSE 8080

COPY ./target/kotlin.playground-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "kotlin.playground-0.0.1-SNAPSHOT.jar"]