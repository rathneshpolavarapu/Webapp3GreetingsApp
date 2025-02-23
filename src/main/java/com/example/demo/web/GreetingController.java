package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.IGreetingsService;



@Controller
public class GreetingController {
	@Autowired
	private IGreetingsService service;
	
	@GetMapping("/greetings")
	public String generateWish(Model model) {
		String wish=service.generateGreetings("Rathnesh");
		
		model.addAttribute("greet", wish);
		return "greet";
	}

}
