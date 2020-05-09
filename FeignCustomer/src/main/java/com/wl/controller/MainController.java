package com.wl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wl.feign.SayHiClient;

@RestController
public class MainController {

	@Autowired
	SayHiClient sayHiClient;
	
	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return sayHiClient.sayHi(name);
	}
	
}
