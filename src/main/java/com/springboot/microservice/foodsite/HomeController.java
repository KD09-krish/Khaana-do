package com.springboot.microservice.foodsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/welcome")
	public void welcome() {
		
		//return 
	}

}
