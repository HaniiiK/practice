package com.classtest.test06;

public class Account {
	private String owner;
	private long balance;
	public Account() {}
	public Account(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
