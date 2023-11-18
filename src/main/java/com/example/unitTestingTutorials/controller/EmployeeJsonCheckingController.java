package com.example.unitTestingTutorials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unitTestingTutorials.model.EmployeeJson;

@RestController
public class EmployeeJsonCheckingController {
	
	@GetMapping("/EmpJson")
	public EmployeeJson getEmployeeList() {
		return new EmployeeJson((long) 1,"thirupathi","Bangalore");
		
	}

}
