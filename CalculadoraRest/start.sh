mvn clean package
docker build -t calculadora-rest .
docker run -d -p 8080:8080 --name calculadora-rest calculadora-rest
