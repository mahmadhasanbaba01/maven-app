package com.baba.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomemsg() {
		return "Welcome To BabaIt....";
	}
}
