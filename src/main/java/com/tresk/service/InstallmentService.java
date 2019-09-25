package com.tresk.service;

import java.util.Map;

import com.tresk.dto.Installment;

public interface InstallmentService {
	
	public void addInstallment(Installment installment) throws Exception;
	public Map<String , String> getMembersList() throws Exception;
}
