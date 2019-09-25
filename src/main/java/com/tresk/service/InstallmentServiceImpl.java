package com.tresk.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresk.dao.InstallmentDao;
import com.tresk.dao.UserDao;
import com.tresk.dto.Installment;
@Service
public class InstallmentServiceImpl implements InstallmentService {
	
	@Autowired
	InstallmentDao dao;

	@Override
	public void addInstallment(Installment installment)throws Exception {
		String error = installment.getMemberId().isEmpty() ? "Member Id" : installment.getYear().isEmpty() ? "Year" : 
			installment.getMonth().isEmpty() ? "Month" : installment.getInvestment().isEmpty() ? "Investment" : installment.getFine().isEmpty() ? "Fine" :"" ;
		if(error.isEmpty())
			dao.addInstallment(installment);
		else
			throw new Exception("Please enter "+error);
	}  
	
	public Map<String , String> getMembersList() throws Exception {
		return dao.getMembersList();
	} 

}
