package com.baeldung.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping(method = RequestMethod.GET, value = "/msg")
    @ResponseBody
    public String getTokens() {
		return "In Test Controller";
    }
}
