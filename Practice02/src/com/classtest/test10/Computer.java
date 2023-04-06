package com.classtest.test10;

public class Computer {
	
	public static final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	public int num;
	public int memory;
	public Computer(int num, int memory) {
		super();
		this.num = num;
		this.memory = memory;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void print() {
		System.out.println("운영체제: "+osType[this.num]+", 메인메모리: "+this.memory);
	}
	
	public static void main(String[] args) {
		
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		pc.print();
		apple.print();
		galaxy.print();
		
	}
	
	
	
	
	
	

}
