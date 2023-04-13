package com.day07.test07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class HV {
	
	public static Vector<String> hashToVector(HashMap<String, String> h) {
		Vector<String> v = new Vector<String>();
		
		Set<Entry<String, String>> entrySet = h.entrySet();
		Iterator<Entry<String, String>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Entry<String, String> ent = iter.next();
			v.add(ent.getKey()+" "+ent.getValue());
		}
		
		return v;
	}
	
	
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = HV.hashToVector(h);
		for(int n=0; n<v.size(); n++) {
			System.out.println(v.get(n));
		}
		
	}
	

}
