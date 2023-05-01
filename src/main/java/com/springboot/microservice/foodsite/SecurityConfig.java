package com.springboot.microservice.foodsite;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{

	public SecurityConfig() {
		// TODO Auto-generated constructor stub
	}
   
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        
	      //  http.oauth2Login().authorizationEndpoint();
	        http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
	        
	        
	            
	        return http.build();
	    }
}
