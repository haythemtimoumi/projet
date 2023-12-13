# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/eventsProject-1.0.0-SNAPSHOT.jar /app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variable
ENV JAVA_OPTS=""

# Run the jar file 
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
