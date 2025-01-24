# Use a base image with Java and Maven pre-installed
FROM maven:3.8-openjdk-17 AS build


# Set the working directory
WORKDIR /app

# Copy the project files
COPY . /app

# Build the Maven project
RUN mvn clean package

# Run the application using the JAR file
ENTRYPOINT ["java", "-jar", "target/smarttutor-0.9.jar"]


