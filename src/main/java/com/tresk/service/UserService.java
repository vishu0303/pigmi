package com.tresk.service;

import com.tresk.dto.User;

public interface UserService {

	public void addUser(User user) throws Exception;
	public boolean validateLogin(String userName,String pswd) throws Exception;
}
