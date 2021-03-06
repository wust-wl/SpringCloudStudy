package com.wl.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	private static final Logger LOG = Logger.getLogger(MainController.class.getName());
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/miya")
	public String home(){
		LOG.log(Level.INFO, "hi is being called");
		return restTemplate.getForObject("http://localhost:6001/info",String.class);
	}

	@RequestMapping("/info")
	public String info(){
		LOG.log(Level.INFO, "info is being called");
		return "hi i'm miya!";
	}

}
