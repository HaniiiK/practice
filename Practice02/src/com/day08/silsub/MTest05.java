package com.day08.silsub;

import java.util.ArrayList;
import java.util.Scanner;

public class MTest05 {

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
		ArrayList<Student> list = new ArrayList<Student>();
		String s = "";
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			s = sc.nextLine();
			String[] arr = s.split(", ");
			Student std = new Student(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]));
			list.add(std);
		}
		for(int i=0; i<4; i++) {
			System.out.println("--------------------");
			System.out.println("이름: "+list.get(i).getName());
			System.out.println("학과: "+list.get(i).getMajor());
			System.out.println("학번: "+list.get(i).getId());
			System.out.println("학점평균: "+list.get(i).getScore());
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
			for(int i=0; i<4; i++) {
				if(list.get(i).getName().equals(name)) {
					idx = i;
					break;
				}
			}
			System.out.println(name+", "+list.get(idx).getMajor()+", "+list.get(idx).getId()+", "+list.get(idx).getScore());
		}
	}
}
