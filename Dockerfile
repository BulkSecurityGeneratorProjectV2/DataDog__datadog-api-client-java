FROM openjdk:12-alpine

RUN mkdir -p /app
WORKDIR /app

ADD https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar /app/google-java-format.jar

RUN [ "1d98720a5984de85a822aa32a378eeacd4d17480d31cba6e730caae313466b97  /app/google-java-format.jar" = "$(sha256sum /app/google-java-format.jar)" ]
