package com.tresk.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tresk.dto.Installment;
@Repository
public class InstallmentDaoImpl implements InstallmentDao {
	
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void addInstallment(Installment installment)throws Exception{
		
		String sql = "insert into installment (memberId,year,month,investment,fine) values(?,?,?,?,?)";
		try {
			jt.update(sql, new Object[]{ installment.getMemberId() , installment.getYear() , installment.getMonth() , installment.getInvestment() , installment.getFine()});
		}catch(Exception e) {
			throw new Exception(e);
			}
	}

	@Override
	public Map<String , String> getMembersList() throws Exception {
		
		String sql = "select id,name from members";
		Map<String , String> membersListMap = new HashMap<String,String>();
		
		try {
		
			List<Map<String,Object>> list = jt.queryForList(sql);	
			
			list.forEach( member -> {
				membersListMap.put(member.get("id").toString(), member.get("name").toString());
			});
			
		}catch(Exception e) {
			throw new Exception(e);
		}
		
		return membersListMap;
	} 
	
	
	

}
