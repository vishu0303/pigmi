package com.tresk.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tresk.dto.Member;
import com.tresk.dto.User;
import com.tresk.service.MemberServices;
import com.tresk.service.UserService;

@Controller
public class MemberController {
	@Autowired
	MemberServices service;
	
	@RequestMapping(value="/memberinformation",method=RequestMethod.GET)
	public String getSignUp(HttpServletRequest req , HttpServletResponse res , Model model) {		
		model.addAttribute("member", new Member());
		return "MemberInformation";
	}
	@RequestMapping(value="/memberinformation",method=RequestMethod.POST)
	public String signup(@ModelAttribute("member") Member member , HttpServletRequest req , HttpServletResponse res,Model model) {
		
		String error = ""; 
		try {
			service.addMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		
		if(!error.isEmpty()) {
			model.addAttribute("error", "Please enter "+error );
			model.addAttribute("info",null);
		}else {
			model.addAttribute("error",null);
			model.addAttribute("info","Add Successfull ");
		}
		
		return "MemberInformation";
	}
}
