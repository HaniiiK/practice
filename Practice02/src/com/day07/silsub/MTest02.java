package com.day07.silsub;

import java.util.ArrayList;
import java.util.Scanner;

public class MTest02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> list = new ArrayList<Character>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		
		String c = "";
		for(int i=0; i<6; i++) {
			c = sc.next();
			list.add(c.charAt(0));
		}
		
		double sum = 0.0;
		for(int i=0; i<6; i++) {
			switch(list.get(i)) {
			case 'A':
				sum+=4.0;
				break;
			case 'B':
				sum+=3.0;
				break;
			case 'C':
				sum+=2.0;
				break;
			case 'D':
				sum+=1.0;
				break;
			case 'F':
				sum+=0.0;
				break;
			}
		}
		sum /= 6;
		System.out.println(sum);
	}

}
