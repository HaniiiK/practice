package com.inherit.test01;

public class Run {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.setMajor("softward");
		st.setNum(11148);
		System.out.println(st.getMajor());
		System.out.println(st.getNum());

	}

}
