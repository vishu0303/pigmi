package com.tresk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresk.dao.MemberDao;
import com.tresk.dao.UserDao;
import com.tresk.dto.Member;
@Service
public class MemberServiceImpl implements MemberServices {
	@Autowired
	MemberDao dao;
	@Override
	public void addMember(Member member)throws Exception {
		String error = member.getName().isEmpty() ? "Name" : member.getMobileNo().isEmpty() ? "Mobile No." : 
			member.getAddress().isEmpty() ? "Address" :"" ;
		if(error.isEmpty())
			dao.addMember(member);
		else
			throw new Exception("Please enter "+error);
	} 

}
