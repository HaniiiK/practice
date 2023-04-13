package com.day07.silsub;

import java.util.HashMap;
import java.util.Scanner;

public class MTest03 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		String nat = "";
		int pop = 0;
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			nat = sc.next();
			if(nat.equals("그만")) {
				break;
			}
			pop = sc.nextInt();
			nations.put(nat, pop);
		}

		nat = "";
		while(true) {
			System.out.print("인구 검색 >> ");
			nat = sc.next();
			if(nat.equals("그만")) {
				break;
			}
			if(nations.containsKey(nat)) {
				System.out.println(nat+"의 인구는 "+nations.get(nat));
			}else {
				System.out.println(nat+" 나라는 없습니다.");
			}
		}
	}

}
