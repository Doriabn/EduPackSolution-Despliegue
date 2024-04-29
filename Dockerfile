FROM amazoncorretto:19.0.2
MAINTAINER DORIAM
COPY target/EduPackSolutions-0.0.1-SNAPSHOT.jar d.jar
ENTRYPOINT ["java","-jar", "d.jar"]