# CalculadoraRest
Este servicio permite realizar la suma de dos numeros.

# Test del servicio

1. Descargar el proyecto
2. Dar permiso de ejecución a los ficheros start.sh y stop.sh con los siguientes comando: chmod +x start.sh y chmod +x stop.sh
3. Ingresar a la carpeta del proyecto y ejecutar start.sh
4. Para poder consumir el servicio se debe utilizar el siguiente comando: curl -i -H "Accept:application/json" -H "Content-type:application/json" -X GET http://localhost:8585/calculadora/sumar/100/200

5. Despues de realizadas las pruebas ejecutar stop.sh para bajar el servicio y eliminar la imagen de docker.

# Hecho por:
Frank Rodriguez
