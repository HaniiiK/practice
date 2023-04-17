package com.day08.silsub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MTest05_2 {

	public static class Student {
		private String name;
		private String major;
		private String id;
		private double score;
		public Student() {}
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		HashMap<String, Student> map = new HashMap<String, Student>();
		String s = "";
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			s = sc.nextLine();
			String[] arr = s.split(", ");
			Student std = new Student(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]));
			map.put(arr[0], std);
		}
		
		Set<Entry<String, Student>> entrySet = map.entrySet();
		Iterator<Entry<String, Student>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next().getKey();
			Student value = iter.next().getValue();
			System.out.println("--------------------");
			System.out.println("이름: "+key);
			System.out.println("학과: "+value.getMajor());
			System.out.println("학번: "+value.getId());
			System.out.println("학점평균: "+value.getScore());
		}
		System.out.println("--------------------");
		String name = "";
		int idx = 0;
		while(true) {
			System.out.print("학생 이름>> ");
			name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			System.out.println(name+", "+map.get(name).getMajor()+", "+map.get(name).getId()+", "+map.get(name).getScore());
		}
	}
}
