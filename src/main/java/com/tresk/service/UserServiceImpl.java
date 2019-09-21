package com.tresk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresk.dao.UserDao;
import com.tresk.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public void addUser(User user) throws Exception {
		String error = user.getName().isEmpty() ? "Name" : user.getMobileNo().isEmpty() ? "Mobile No." : 
			user.getAddress().isEmpty() ? "Address" : user.getUserName().isEmpty() ? "User Name": "" ;
		if(error.isEmpty())
			dao.addUser(user);
		else
			throw new Exception("Please enter "+error);
	}

	@Override
	public boolean validateLogin(String userName, String pswd) throws Exception {
		return dao.validateLogin(userName, pswd);
	}

}
