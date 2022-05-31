FROM openjdk:17-slim as builder
WORKDIR application
ADD maven/${project.build.finalName}.jar ${project.build.finalName}.jar
RUN java -Djarmode=layertools -jar ${project.build.finalName}.jar extract

FROM openjdk:17-slim
LABEL PROJECT_NAME=${project.artifactId} \
      PROJECT=${project.id}

ARG SPRING_PROFILES_ACTIVE

EXPOSE 8080

WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "org.springframework.boot.loader.JarLauncher"]
