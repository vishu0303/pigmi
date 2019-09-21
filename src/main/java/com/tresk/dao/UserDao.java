package com.tresk.dao;

import java.util.List;

import com.tresk.dto.User;

public interface UserDao {

	public void addUser(User user) throws Exception;
	public boolean validateLogin(String userName,String pswd) throws Exception;
}
