package com.wl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MainController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "error")
	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
	}
	
	public String error(String name) {
		return "Error! there is something wrong...";
	}
	
}
