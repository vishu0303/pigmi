package com.tresk.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String getHome(ServletRequest req , ServletResponse res) {
		return "Home";
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String getDashBoard(ServletRequest req , ServletResponse res) {
		return "Dashboard";
	}
}
