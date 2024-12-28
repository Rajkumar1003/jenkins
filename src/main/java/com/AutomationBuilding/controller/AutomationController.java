package com.AutomationBuilding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clean")
public class AutomationController {
	
	@GetMapping(value="/name")
	public String get() {
		return "Jenkins";
	}

}
