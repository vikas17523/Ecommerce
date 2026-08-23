package com.springrest.springrest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.model.Login;

import jakarta.servlet.http.HttpServletRequest;



@RestController
public class SiteMakerController {

@Value("${payusalt}")
private String payusalt;
	
	@PostMapping("/login")
	public String login(HttpServletRequest request,@RequestBody Login login) {
		 
		
		System.out.println("vikas update contoller :-- ");
		
		System.out.println("API:--: "+payusalt);
		
		return "OUR API PROJECT CALL";
	}
	
	
	
}
