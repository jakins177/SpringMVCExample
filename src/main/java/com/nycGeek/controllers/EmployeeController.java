package com.nycGeek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@GetMapping("getForm")
	public String getForm() {
		System.out.println("Currently Dislaying Formz");
		return "EmployeeForm";
	}
	
	@PostMapping("/saveDetails")
	public String saveDetails(@RequestParam("name") String name,
							  @RequestParam("email") String email,
							  ModelMap modelMap) {
		
		modelMap.put("name", name);
		modelMap.put("email", email);
		
		System.out.println("Form successfully submitted");
		
		return "EmployeeView";
		
	}
																		

}
