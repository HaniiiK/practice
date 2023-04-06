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
	
	public long deposit(long amount) {
		this.balance = this.balance+amount;
		return this.balance;
	}
	public long withdraw(long amount) {
		this.balance = this.balance-amount;
		return this.balance;
	}
	
	public static void main(String[] args) {
		Account ac = new Account("kim", 15000000);
		System.out.println(ac.getBalance());
		System.out.println(ac.deposit(60000));
		System.out.println(ac.withdraw(60000));
	}
}
