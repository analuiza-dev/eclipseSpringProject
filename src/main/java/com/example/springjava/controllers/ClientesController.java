package com.example.springjava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjava.models.Cliente;
/**
 * 
 * @author Luiza Sampaio
 *
 */
@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Luiza", "222.333.111-01");
	}
//	MEU JSON
	@GetMapping(path = "/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "324.676.451-01");
	}
	
	@GetMapping(path = "/")
	public String ola() {
		return "oi";
	}
}
