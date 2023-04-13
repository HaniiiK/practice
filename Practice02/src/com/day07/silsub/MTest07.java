package com.day07.silsub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MTest07 {

	public static void main(String[] args) {
		System.out.println("미래장학금관리시스템입니다.");
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		String name = "";
		double grade = 0.0;
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			grade = sc.nextDouble();
			map.put(name, grade);
		}
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double max = sc.nextDouble();
		
		String list = "";
		Set<Entry<String, Double>> entrySet = map.entrySet();
		Iterator<Entry<String, Double>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Double> ent = iter.next();
			if(ent.getValue()>=max) {
				list += ent.getKey()+" ";
			}
		}
		System.out.println("장학생 명단 : "+list);
	}
}
