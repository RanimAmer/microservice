FROM openjdk:17

EXPOSE 8083

ADD target/job-0.0.1-SNAPSHOT.jar job-dk.jar

ENTRYPOINT ["java", "-jar", "job-dk.jar"]
