FROM openjdk:8-jdk-alpine
LABEL maintainer="hanzhiqiang <hanzhiqiang@lenztechretail.com>"
VOLUME ["/tmp","/data"]
ADD target/*.jar /app.jar
RUN touch /app.jar
EXPOSE 8183
ENTRYPOINT ["java","-jar","/app.jar"]