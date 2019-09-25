package com.tresk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tresk.dto.Member;
@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public void addMember(Member member) throws Exception{
		
		String sql = "insert into members (name,mobile,address) values(?,?,?)";
		try {
			jt.update(sql, new Object[]{ member.getName() , member.getMobileNo() , member.getAddress()});
		}catch(Exception e) {
			throw new Exception(e);
		}
	} 
}
