package com.example.springjava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjava.models.Cliente;
/**
 * 
 * @author Luiza Sampaio
 * Comitando alteração diretamente da IDE
 */
@RestController
public class ClientesController {
	
	@GetMapping(path = "/clientes/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Luiza", "222.333.111-01");
	}
	
	@GetMapping(path = "/")
	public String ola() {
		return "oi";
	}
}
