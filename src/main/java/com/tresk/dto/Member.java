package com.tresk.dto;

public class Member {
	
	private String memberId;
	private String name;
	private String mobileNo;
	private String address;
	
	public Member() {
		
	}
	
	public Member(String name, String mobileNo, String address) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
}
