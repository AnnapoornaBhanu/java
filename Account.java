package org.cap.demo;

import java.util.Date;

public class Account {
	
	private long accountNo;
	private String accountType;
	private Date openingDate;
	private int openingBal;
	private int currentBal;
	
	public int getCurrentBal() {
		return currentBal;
	}

	public void setCurrentBal(int currentBal) {
		this.currentBal = currentBal;
	}

	public Account()
	{
		
	}
	
	public Account(long accountNo, String accountType, Date openingDate, int openingBal, int currentBal) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.openingDate = openingDate;
		this.openingBal = openingBal;
		this.currentBal = currentBal;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public int getOpeningBal() {
		return openingBal;
	}

	public void setOpeningBal(int openingBal) {
		this.openingBal = openingBal;
	}
	
	
	
	

}
