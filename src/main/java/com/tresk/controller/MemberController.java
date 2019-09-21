package com.tresk.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MemberController {

	@RequestMapping(value="/memberinformation",method=RequestMethod.GET)
	public String getSignUp(ServletRequest req , ServletResponse res , HttpSession session) {		
		return "MemberInformation";
	}
}
