# Use JDK 21 official base image
FROM openjdk:21

# Set working directory inside the container
WORKDIR /app

# Copy your JAR file into the image
COPY target/QuoteBook-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
CMD ["java", "-jar", "app.jar"]
