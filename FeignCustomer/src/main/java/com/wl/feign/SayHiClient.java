package com.wl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wl.feign.impl.SayHiClientImpl;

@FeignClient(value = "service-hi", fallback = SayHiClientImpl.class)
public interface SayHiClient {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name);
	
}
