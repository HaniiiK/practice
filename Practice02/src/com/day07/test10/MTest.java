package com.day07.test10;

import java.util.HashMap;
import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		HashMap<String, Location> loc = new HashMap<String, Location>();
		
		loc.put("서울", new Location(38, 127));
		loc.put("베를린", new Location(52, 13));
		loc.put("리스본", new Location(38, 9));
		loc.put("런던", new Location(52, 0));
		loc.put("로마", new Location(42, 12));
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(loc.containsKey(s)) {
			System.out.println(s+"의 위도와 경도: "+loc.get(s).getLatitude()+", "+loc.get(s).getLongitude());
		}else {
			System.out.println(s+"의 위도와 경도 정보가 없습니다.");
		}
	}

}
