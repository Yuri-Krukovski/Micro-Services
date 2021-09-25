FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/Stock-Client-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]


FROM maven:3.6.3-openjdk-11 AS builder
RUN mkdir -p /build
COPY . .
WORKDIR /build
RUN mvn clean install

FROM alpine:latest
ENV PATH="$PATH:$JAVA_HOME/bin"

COPY --from=packager "$JAVA_HOME" "$JAVA_HOME"
COPY --from=builder /build/build/libs/Stock-Client-0.0.1-SNAPSHOT.jar /root/Stock-Client-0.0.1-SNAPSHOT.jar
WORKDIR /root
ENTRYPOINT ["java", "-jar", "mobile-api-0.1.0.jar"]