package com.codeusingjava.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value(value = "${spring.profile.message}")
	private String msg;

	@GetMapping(value = "/demo")
	public String demo() {
		return msg;
	}
}
