package com.example.spring.Oauth2.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/getAll")
	public String getWelcomeMessage() {
		return "Welcome to Oauth";
	}
	
	@GetMapping("/users")
	public Principal user(Principal principal) {
		System.out.println("username "+ principal.getName());
		return principal;
	}
}
