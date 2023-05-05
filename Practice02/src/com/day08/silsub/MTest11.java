package com.day08.silsub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MTest11 {

	public static void main(String[] args) {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("한국", "서울");
		map.put("일본", "도쿄");
		map.put("미국", "워싱턴");
		map.put("이탈리아", "로마");
		map.put("독일", "베를린");
		map.put("프랑스", "파리");
		
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		String nat = "";
		String cap = "";
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			ch = sc.nextInt();
			int size = map.size()+1;
			switch(ch) {
			case 1:
				System.out.println("현재 "+map.size()+"개의 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력"+size+">> ");
					nat = sc.next();
					if(nat.equals("그만")) {
						break;
					}
					cap = sc.next();
					if(map.containsKey(nat)) {
						System.out.println(nat+"는 이미 있습니다!");
					}else {
						map.put(nat, cap);
					}
				}
				break;
			case 2:
				Set<Entry<String, String>> entrySet = map.entrySet();
				Iterator<Entry<String, String>> iter = entrySet.iterator();
				while(iter.hasNext()) {
					Entry<String, String> ent = iter.next();
					System.out.print(ent.getKey()+"의 수도는? ");
					String answer = sc.next();
					if(answer.equals("그만")) {
						break;
					}
					if(ent.getValue().equals(answer)) {
						System.out.println("정답!!");
					}else {
						System.out.println("아닙니다!!");
					}
				}
				break;
			case 3:
				System.out.println("종료");
				return;
			}
		}
	}
}
