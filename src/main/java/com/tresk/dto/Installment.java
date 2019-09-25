package com.tresk.dto;

public class Installment {
		
	private String memberId;
	private String year;
	private String month;
	private String investment;
	private String fine;
		
	public Installment() {
		
	}
	
		public Installment(String memberId, String year, String month, String investment, String fine) {
	
		this.memberId = memberId;
		this.year = year;
		this.month = month;
		this.investment = investment;
		this.fine = fine;
	}
		
		public String getMemberId() {
			return memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public String getInvestment() {
			return investment;
		}

		public void setInvestment(String investment) {
			this.investment = investment;
		}

		public String getFine() {
			return fine;
		}

		public void setFine(String fine) {
			this.fine = fine;
		}
		
}
