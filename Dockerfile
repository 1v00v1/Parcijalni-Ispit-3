FROM openjdk:21-jdk-slim
LABEL authors="goran"
COPY target/Parcijalni-Ispit-3-0.0.1-SNAPSHOT.jar pi3.jar

EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/pi3.jar" ]