FROM azul/zulu-openjdk:11
VOLUME /tmp /var/log
ENV SPRING_PROFILES_ACTIVE=docker
COPY target/*.jar app.jar
EXPOSE 8085
# ADD src/main/resources/db/dump.sql docker-entrypoint-initdb.d
ENTRYPOINT ["java", "-jar","/app.jar"]
