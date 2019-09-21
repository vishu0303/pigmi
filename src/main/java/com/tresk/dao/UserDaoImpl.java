package com.tresk.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tresk.dto.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void addUser(User user) throws Exception{
		
		String sql = "insert into users (name,mobile,address,username,password) values(?,?,?,?,?)";
		try {
			jt.update(sql, new Object[]{ user.getName() , user.getMobileNo() , user.getAddress() , user.getUserName(),user.getPassword()});
		}catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public boolean validateLogin(String userName, String pswd) throws Exception {
		String sql = "select username,password from users where username = ? and password = ?";
		try {
			List<Map<String,Object>>  result = jt.queryForList(sql,new Object[] { userName , pswd});
			if(result.isEmpty()) {
				throw new Exception("Username/Password doesn't match");
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return true;
	}

}
