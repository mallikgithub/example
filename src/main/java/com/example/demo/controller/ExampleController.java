package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@RequestMapping("/helloworld")
	public String getDate(){
		return "Hello Mallik";
	}

}
