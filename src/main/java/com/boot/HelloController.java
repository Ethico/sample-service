package com.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class); 
	
	@RequestMapping("/greeting")
	public String greeting(){
		LOGGER.debug("**** Inside HelloController *****");	
		return "Hola, World!";
	}

}
