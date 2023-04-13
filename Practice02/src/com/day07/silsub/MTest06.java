package com.day07.silsub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MTest06 {

	public static class Location {
		private String city;
		private String longitude;
		private String latitude;
		public Location() {}
		public Location(String city, String longitude, String latitude) {
			super();
			this.city = city;
			this.longitude = longitude;
			this.latitude = latitude;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("도시, 경도, 위도를 입력하세요.");
		Scanner sc = new Scanner(System.in);	
		
		HashMap<String, Location> map = new HashMap<String, Location>();
		
		String s = "";
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			s = sc.nextLine();
			String[] arr = s.split(", ");
			map.put(arr[0], new Location(arr[0], arr[1], arr[2]));
		}
		System.out.println("-----------------");
		Set<Entry<String, Location>> entrySet = map.entrySet();
		Iterator<Entry<String, Location>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Location> ent = iter.next();
			System.out.println(ent.getKey()+"  "+ent.getValue().getLongitude()+"  "+ent.getValue().getLatitude());
		}
		System.out.println("-----------------");
		s = "";
		while(true) {
			System.out.print("도시 이름 >> ");
			s = sc.next();
			if(s.equals("그만")) {
				break;
			}
			if(map.containsKey(s)) {
				System.out.println(s+"  "+map.get(s).getLongitude()+"  "+map.get(s).getLatitude());
			}else {
				System.out.println(s+"는 없습니다.");
			}
		}
	}

}
