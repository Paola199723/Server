package com.demoJpa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerDemo {
	
		@RequestMapping(value={"/hello"}, method = RequestMethod.GET)
		public String login(){
			
			return "Hola Mundo!";
		}
		
}


