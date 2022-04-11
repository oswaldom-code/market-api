package com.marketapi.adapters.in.rest.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Health {
	@GetMapping("/ping")
	public String ping(Model model) {
		model.addAttribute("message", "Hello World");
		return "pong";
	}
}
