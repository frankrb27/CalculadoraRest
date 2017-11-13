# CalculadoraRest
Este servicio permite realizar la suma de dos numeros.

# Test del servicio

1. Descargar el proyecto
2. Ingresar a la carpeta del proyecto y ejecutar start.sh
3. Para poder consumir el servicio se debe utilizar el siguiente comando: curl -i -H "Accept: application/json" -H "Contetnt-type: applicaction/json" http://localhost:8080/calculadora/sumar?num1=1&num2=3
4. Despues de realizadas las pruebas ejecutar stop.sh para bajar el servicio y eliminar la imagen de docker.

# Hecho por:
Frank Rodriguez
