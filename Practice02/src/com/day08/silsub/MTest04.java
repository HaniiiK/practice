package com.day08.silsub;

import java.util.Scanner;
import java.util.Vector;

public class MTest04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int sum = 0;
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			sum += n;
			v.add(n);
			for(Integer i : v) {
				System.out.print(i+" ");
			}
			System.out.println("\n현재 평균 "+sum/v.size());
		}
	}

}
