package org.joonzis.test;

public class Circle {
	Coordinate center;
	double radius;
	
	public Circle() {
		
	}
	public Circle(Coordinate c ,double r) {
		
		center = c;
		radius = r;
		
	}
	
	void output() {
		center.output();
		
		System.out.println("반지름 : " + radius);
	}
	
	
}
