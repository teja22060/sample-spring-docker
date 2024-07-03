FROM maven:3.8.5-openjdk-17 AS build
COPY target/*.jar /app/app.jar

COPY entrypoint.sh /app/entrypoint.sh
COPY startup.sh /app/startup.sh

COPY healthcheck.sh /app/healthcheck.sh

RUN chmod +x /app/entrypoint.sh /app/startup.sh /app/healthcheck.sh

WORKDIR /app

# Set the entrypoint
ENTRYPOINT ["/app/entrypoint.sh"]

# Default command
CMD ["/app/startup.sh"]
