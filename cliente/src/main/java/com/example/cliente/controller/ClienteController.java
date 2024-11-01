package com.example.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cliente.repository.ClienteRepository;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	
	@Autowired
	private ClienteRepository repo;
	
	@GetMapping({"","/"})
	public String getClientes(Model model) {
		var clientes = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
		
		model.addAttribute("clientes", clientes);
		
		return "clientes/index";
	}
}
