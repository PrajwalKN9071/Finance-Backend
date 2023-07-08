# This is the base image for Windows Server Core with Java 8
FROM openjdk:8-windowsservercore

# Set the working directory
WORKDIR /app

# Copy the application files to the container
COPY . .

# Set the command to run the Java application
CMD ["java", "-jar", "app.jar"]
