package com.inherit.test01;

public class Student {
	private String major;
	private int num;
	
	public Student() {}
	public Student(String major, int num) {
		super();
		this.major = major;
		this.num = num;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
