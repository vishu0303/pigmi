package com.tresk.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InstallmentController {
	
	@RequestMapping(value="/installment",method=RequestMethod.GET)
	public String getSignUp(ServletRequest req , ServletResponse res) {
		return "Installment";
	}
}
