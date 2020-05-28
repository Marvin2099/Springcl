package com.marvin.practica;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		String sms = "No me compila :(";
		modelo.addAttribute("Compa", sms);
		return "index";
	}
	
}
