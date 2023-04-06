package com.inherit.test03;

public class Cylinder {
	public Circle c;
	public double height;
	
	public Cylinder() {}
	public Cylinder(Circle c, double height) {
		super();
		this.c = c;
		this.height = height;
	}
	public Circle getC() {
		return c;
	}
	public void setC(Circle c) {
		this.c = c;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return c.getArea() * height;
	}

	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		double height = 5.6;
		Cylinder cy = new Cylinder(c, height);
		
		System.out.println(cy.getVolume());
	}
}
