FROM openjdk:8
WORKDIR  /app
copy . .
EXPOSE 8080
ADD target/*jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]