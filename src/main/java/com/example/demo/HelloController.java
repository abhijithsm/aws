package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public String index() {
    	
      	String name = "1";
        return name;
    }

}