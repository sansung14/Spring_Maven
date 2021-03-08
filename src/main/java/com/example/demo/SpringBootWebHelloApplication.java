package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWebHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebHelloApplication.class, args);
	}

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
	
}
