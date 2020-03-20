package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.persona;
import com.example.repo.IpersonaRepo;

@Controller
public class DemoController {
 
	 private IpersonaRepo repo;
	 
	@GetMapping("/hola")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World Anderson") String name, Model model) {
		persona p= new persona();
		
		p.setIdPersona(1);
		p.setNombre("Anderson");
		repo.save(p);
		
		model.addAttribute("name",name);
		return "greeting";
	}
}
