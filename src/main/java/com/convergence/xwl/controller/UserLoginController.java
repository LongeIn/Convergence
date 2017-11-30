package com.convergence.xwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
	
	@RequestMapping("/login")
	public String LoginIndex(){
		return "login";
	}
	
	
}
