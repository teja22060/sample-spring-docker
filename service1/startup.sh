#!/bin/bash
set -e

# # Example: Wait for a database to be ready
# until nc -z -v -w3 db 3306
# do
#   echo "Waiting for database connection..."
#   sleep 1
# done

echo "Waiting for some connection..."

# Start the main process
exec java -jar app.jar
