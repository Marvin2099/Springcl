package com.marvin.practica;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.marvin.practica.model.Persona;

@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		Persona perso = new Persona();
		perso.setNombre("Marvin");
		perso.setApellido("Recinos");
		perso.setTelefono("1231232");
		perso.setEmail("recinos@gmail.com");
		
		Persona perso2 = new Persona();
		perso2.setNombre("Gustabo");
		perso2.setApellido("Horacio");
		perso2.setTelefono("4214334");
		perso2.setEmail("Gustacio@gmail.com");
		
		/*Si da error en el script de abajo hacer este casteo despus del igual(List)*/
		List personas = Arrays.asList(perso,perso2);
		
		
		String sms = "No me compila hommie:(";
		//modelo.addAttribute("Compa", sms);	
		modelo.addAttribute("personas",personas);
		
		return "index";
	}
	
}
