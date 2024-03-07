package com.fusiontech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

	public StudentController() {

		System.out.println("inside StudentController const");
	}

	@GetMapping("/hii")
	public String getname()

	{
		System.out.println("inside getname");
		return "hello java";
	}

}
