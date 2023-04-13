package com.day07.test09;

import java.util.HashMap;

public class MTest {

	public static void main(String[] args) {
		HashMap<String, Student> dept = new HashMap<String, Student>();
		
		Student s1 = new Student("홍길동","경영","1148",3.9);
		Student s2 = new Student("신용권","전자","1894",4.2);
		Student s3 = new Student("동장군","기계","1568",3.6);
		Student s4 = new Student("김자바","물리","1165",3.2);
		Student s5 = new Student("박지원","경제","1095",4.1);
		
		dept.put(s1.getId(), s1);
		dept.put(s2.getId(), s2);
		dept.put(s3.getId(), s3);
		dept.put(s4.getId(), s4);
		dept.put(s5.getId(), s5);
		
		System.out.println("학번 "+s1.getId()+" 학생의 이름 : "+dept.get(s1.getId()).getName()+
											", 전공: "+dept.get(s1.getId()).getMajor()+
											", 학점: "+dept.get(s1.getId()).getScore());
	}
}
