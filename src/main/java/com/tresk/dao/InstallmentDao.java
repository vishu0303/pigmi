package com.tresk.dao;

import java.util.Map;

import com.tresk.dto.Installment;

public interface InstallmentDao {
	
	public void addInstallment(Installment installment)throws Exception;
	
	public Map<String , String> getMembersList()throws Exception;

}
