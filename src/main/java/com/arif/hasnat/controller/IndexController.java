package com.arif.hasnat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "WEB-INF/jsp/index.jsp";
		
		
	}

}
