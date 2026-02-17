@echo off
ECHO "Starting all microservices..."

REM Start Eureka Server
ECHO "Starting Eureka Server..."
cd eureka-server/eureka-server
start "Eureka Server" cmd /k "mvnw.cmd spring-boot:run"
cd ../..

REM Start Shipment Service
ECHO "Starting Shipment Service..."
cd shipment/shipment
start "Shipment Service" cmd /k "mvnw.cmd spring-boot:run"
cd ../..

REM Start Admin Service
ECHO "Starting Admin Service..."
cd admin/admin
start "Admin Service" cmd /k "mvnw.cmd spring-boot:run"
cd ../..

REM Start Operations Service
ECHO "Starting Operations Service..."
cd operations/operations
start "Operations Service" cmd /k "mvnw.cmd spring-boot:run"
cd ../..

REM Start Support Service
ECHO "Starting Support Service..."
cd support/support
start "Support Service" cmd /k "mvnw.cmd spring-boot:run"
cd ../..

ECHO "All microservices are starting in separate windows."
