FROM openjdk
LABEL maintainer="hanzhiqiang <hanzhiqiang@lenztechretail.com>"
VOLUME ["/tmp","/data"]
ADD target/eurekaserver*.jar /app.jar
RUN touch /app.jar
EXPOSE 8763
ENTRYPOINT ["java","-Dspring.profiles.active=host8763","-jar","/app.jar"]