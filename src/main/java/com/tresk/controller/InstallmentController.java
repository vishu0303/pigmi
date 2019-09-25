package com.tresk.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tresk.dto.Installment;
import com.tresk.service.InstallmentService;

@Controller
public class InstallmentController {
	
	@Autowired
	InstallmentService service;
	
	@RequestMapping(value="/installment",method=RequestMethod.GET)
	public String getSignUp(HttpServletRequest req , HttpServletResponse res,Model model) {
		model.addAttribute("installment", new Installment());
		try {
			model.addAttribute("membersList" , service.getMembersList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Installment";
	}
	@RequestMapping(value="/installment",method=RequestMethod.POST)
	public String signup(@ModelAttribute("installment") Installment installment , HttpServletRequest req , HttpServletResponse res,Model model) {
		
		String error = ""; 
		try {
			service.addInstallment(installment);
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
		
		try {
			model.addAttribute("membersList" , service.getMembersList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Installment";
	}
}
