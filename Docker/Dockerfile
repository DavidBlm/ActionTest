# Use an official OpenJDK base image
FROM eclipse-temurin:17-jdk as builder

# Install Gradle manually
RUN apt update && apt install -y curl unzip && \
    curl -sLo gradle.zip https://services.gradle.org/distributions/gradle-8.6-bin.zip && \
    unzip gradle.zip -d /opt/ && \
    rm gradle.zip && \
    ln -s /opt/gradle-8.6/bin/gradle /usr/local/bin/gradle

# Set working directory
WORKDIR /app

# Set Gradle as default command
CMD ["gradle", "--version"]