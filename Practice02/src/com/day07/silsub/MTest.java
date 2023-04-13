package com.day07.silsub;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class MTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		
		int n = 0;
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(n!=-1) {
			n = sc.nextInt();
			v.add(n);
		}
		Object[] arr = v.toArray();
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
	}
}
