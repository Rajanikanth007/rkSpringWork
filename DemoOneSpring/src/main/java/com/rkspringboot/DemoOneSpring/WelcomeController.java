package com.rkspringboot.DemoOneSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to first spring boot app development";
	}

}
