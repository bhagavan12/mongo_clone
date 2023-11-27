# Use the official OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the WAR file into the container at /app
COPY target/mongo_clone-0.0.1-SNAPSHOT.war /app/app.war

# Expose the port that the application will run on
EXPOSE 9876

# Specify the command to run on container startup
CMD ["java", "-jar", "app.war"]
