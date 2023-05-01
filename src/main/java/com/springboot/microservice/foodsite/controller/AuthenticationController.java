package com.springboot.microservice.foodsite.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AuthenticationController {

	public AuthenticationController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	@GetMapping("/user")
	public Principal getUserDetails(Principal principal) {
		System.out.println("The name "+principal.getName());
		return principal;
	}

}
