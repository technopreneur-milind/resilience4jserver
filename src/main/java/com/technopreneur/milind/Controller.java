package com.technopreneur.milind;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
public class Controller {
	
	@GetMapping("/value1")
	public String getValue1() {
		return "Value1 from Backend Server";
	}
	
	@GetMapping("/value2")
	public String getValue2() {
		return "Value2 from Backend Server";
	}


}
