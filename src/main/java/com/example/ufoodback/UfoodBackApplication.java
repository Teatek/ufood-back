package com.example.ufoodback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class UfoodBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UfoodBackApplication.class, args);
	}

	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("title", "Home");
		return "main";
	}

}
