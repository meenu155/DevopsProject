# Use an official JDK runtime as a parent image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory
WORKDIR /springbootimage

# Copy the built application JAR
COPY target/*.jar springbootimage.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "springbootimage.jar"]
