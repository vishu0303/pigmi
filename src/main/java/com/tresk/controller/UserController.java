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


import com.tresk.dto.User;
import com.tresk.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String getSignUp(HttpServletRequest req , HttpServletResponse res,Model model) {
		model.addAttribute("user", new User());
		return  "SignUp";
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public String signup(@ModelAttribute("user") User user , HttpServletRequest req , HttpServletResponse res,Model model) {
		
		String error = ""; 
		try {
			service.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		
		if(!error.isEmpty()) {
			model.addAttribute("error", "Please enter "+error );
			model.addAttribute("info",null);
		}else {
			model.addAttribute("error",null);
			model.addAttribute("info","Signup Successfull <a href=\"/login\"> Click here to go to Login </a>");
		}
		
		return "SignUp";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLogin(HttpServletRequest req , HttpServletResponse res) {
		return  "Login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest req , HttpServletResponse res, HttpSession session , Model model) {
		
		String error = "";
		String userName = req.getParameter("username");
		String pswd = req.getParameter("pswd");
		try {
			service.validateLogin(userName, pswd);
			session.setAttribute("username" , userName);
			return "redirect:home";			
		}catch(Exception e) {
			error = e.getMessage();
		}
		
		if(!error.isEmpty()) {
			model.addAttribute("error", error );
		}
		
		return "Login";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String getSignUp(HttpSession session) {
		session.removeAttribute("username");
		return  "Login";
	}
	
}
