package com.example.somepack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneClass {
	@RequestMapping("/sayhello")
	public String sayHello(){
		return "Say Hello";
	}
}
