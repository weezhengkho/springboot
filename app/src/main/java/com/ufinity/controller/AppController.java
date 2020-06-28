package com.ufinity.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	private static final Logger logger = LogManager.getLogger(AppController.class);

	@RequestMapping("/")
	public String index() {
		logger.info("hello from /");
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		logger.info("hello from /greeting");
		model.addAttribute("name", name);
		return "greeting";
	}
}
