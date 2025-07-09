FROM openjdk:21-jdk-slim
LABEL authors="goran"
COPY target/Parcijalni-Ispit-3-0.0.1-SNAPSHOT.jar pi.jar/

EXPOSE 8087
ENTRYPOINT ["java", "-jar", "/pi.jar" ]