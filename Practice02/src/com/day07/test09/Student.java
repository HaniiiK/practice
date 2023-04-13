package com.day07.test09;

public class Student {
	private String name;
	private String major;
	private String id;
	private double score;
	
	public Student() {

	}
	public Student(String name, String major, String id, double score) {
		super();
		this.name = name;
		this.major = major;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
