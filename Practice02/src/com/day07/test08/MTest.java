package com.day07.test08;

public class MTest {

	public static void main(String[] args) {
		MyClass<String> m1 = new MyClass<String>("ㅎㅎ");
		MyClass<String> m2 = new MyClass<String>("test");
		
		System.out.println(m1.getS());
		System.out.println(m2.getS());
		
	}

}
