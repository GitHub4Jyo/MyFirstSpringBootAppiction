package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloToSpringBoot {
	
	@RequestMapping("/greeting")
	public SayHelloPojo sayHello(@RequestParam (value="name", defaultValue="World") String name) {
		return new SayHelloPojo(56789, String.format("Hello %s !", name));
	}
}
