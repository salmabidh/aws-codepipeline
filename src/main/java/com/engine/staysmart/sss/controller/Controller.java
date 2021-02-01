package com.engine.staysmart.sss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping("/aws-codepipeline")
	
	public String welcome() {
		return "welcome to aws-code-pipeline";
		
	}

}
