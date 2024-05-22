package com.callor.hello.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
//	@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping(value="/")
	public String home() {
		return "Hello Korea";
	}

}
