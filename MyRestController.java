package com.example.jenkinDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {
	
	
	@RequestMapping("/hello")
	public void sayHello()
	{
		System.out.println("Say Hello to Tebz");
		 
		
	}

}
