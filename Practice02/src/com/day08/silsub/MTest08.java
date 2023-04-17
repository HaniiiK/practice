package com.day08.silsub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MTest08 {

	public static void main(String[] args) {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		String s = "";
		int num = 0;
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			s = sc.next();
			if(s.equals("그만")) {
				break;
			}
			num = sc.nextInt();
			if(map.containsKey(s)) {
				int pre = map.get(s);
				map.remove(s);
				map.put(s, pre+num);
			}else {
				map.put(s, num);				
			}

			Set<Entry<String, Integer>> entrySet = map.entrySet();
			Iterator<Entry<String, Integer>> iter = entrySet.iterator();
			while(iter.hasNext()) {
				Entry<String, Integer> ent = iter.next();
				String key = ent.getKey();
				Integer value = ent.getValue();
				System.out.print("("+key+","+value+")");				
			}
			System.out.println();
		}
	}
}
