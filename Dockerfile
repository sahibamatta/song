FROM openjdk:8
ADD target/song-0.0.1-SNAPSHOT.jar song-0.0.1-SNAPSHOT.jar
EXPOSE 8071
ENTRYPOINT ["java", "-jar", "song-0.0.1-SNAPSHOT.jar"]