# Use an official OpenJDK runtime as the base image
FROM openjdk:17


# Copy the built JAR file to the container
ADD target/product-management-tool.jar product-management-tool.jar

# Expose the application port (adjust based on your app)
EXPOSE 8091

# Command to run the application
ENTRYPOINT ["java", "-jar", "/product-management-tool.jar"]
