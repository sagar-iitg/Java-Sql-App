FROM openjdk:21-slim-buster
COPY . /
WORKDIR /
RUN javac DataConnection.java
CMD ["java","-cp","mysql-connector.jar:.","DataConnection"]