package com.ProyFinal.FisioterapiaVM;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPrin {
	@GetMapping("/index")
	public String bienvenida(Model model) {
		model.addAttribute("mensaje",model.getAttribute("hola"));
		return "/index";
	}
	@GetMapping("/elements")
	public String elementos(Model model){
		return"/elements";
	}
	@GetMapping("/generic")
	public String generica(Model model){
		return"/generic";
	}
}
