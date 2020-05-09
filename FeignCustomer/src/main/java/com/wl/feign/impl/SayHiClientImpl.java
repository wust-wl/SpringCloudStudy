package com.wl.feign.impl;

import org.springframework.stereotype.Component;

import com.wl.feign.SayHiClient;

@Component
public class SayHiClientImpl implements SayHiClient {

	@Override
	public String sayHi(String name) {
		return "Error! there is something wrong...";
	}

}
