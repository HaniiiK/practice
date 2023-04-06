package com.classtest.test09;

public class Rectangle {
	public double width;
	public double height;
	
	public Rectangle() {}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.width*this.height;
	}
	public double getCircumference() {
		return (this.width+this.height)*2;		
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		
		System.out.println("면적: "+rc.getArea());
		System.out.println("둘레: "+rc.getCircumference());
	}
}
