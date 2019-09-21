package com.tresk.dto;

public class User {

	private String name ;
	private String  mobileNo;
	private String  address;
	private String userName;
	private String password ;
	
	public User() {
		
	}

	public User(String name, String mobileNo, String address, String userName, String password) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
