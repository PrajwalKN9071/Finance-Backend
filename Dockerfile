# This is the base image for Windows Server Core with Java 8
#FROM openjdk:8-windowsservercore

# Set the working directory
#WORKDIR /app

# Copy the application files to the container
#COPY . .

# Set the command to run the Java application
#CMD ["java", "-jar", "app.jar"]


# Use a base image with Java and Maven pre-installed
FROM maven:3.8.4-openjdk-11 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the project's pom.xml file
COPY pom.xml .

# Download the project dependencies, excluding the problematic dependency
RUN mvn dependency:go-offline -B -Dmaven.repo.local=/tmp/m2/repository -DexcludeGroupIds=com.oracle.database.xml

# Copy the source code
COPY src ./src

# Build the application
RUN mvn package

# Create a new image with a smaller footprint
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built artifact from the previous stage
COPY --from=build /app/target/*.jar ./app.jar

# Specify the command to run the application
CMD ["java", "-jar", "app.jar"]
