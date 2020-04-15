package com.nycGeek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("Welcome home honey!");
		
		return "home";
		
	}
	
	@RequestMapping("/showForm101")
	public String showForm() {
		//System.out.println("Welcome home honey!");
		
		return "ShowForm";
		
	}
	

}
