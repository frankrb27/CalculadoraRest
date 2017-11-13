package com.calculadora.resource;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora")
public class CalculadoraResource {

	@RequestMapping(path = "sumar", method = RequestMethod.GET,
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public double suma(@PathParam("num1") double num1, @PathParam("num2") double num2) {
		return num1 + num2;
	}
}