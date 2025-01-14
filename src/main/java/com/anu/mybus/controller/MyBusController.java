package com.anu.mybus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyBusController 
{
	
	@GetMapping("/")
	public String Loadhome()
	{
		return "home.html";
	}
	
	@GetMapping("/signup")
	public String Signup()
	{
		return "signup.html";
	}
	
	@PostMapping("/signup")
	public String signup(@RequestParam String role) {
		if (role.equals("customer"))
			return "redirect:/customer/signup";
		else
			return "redirect:/agency/signup";
	}

	
}
