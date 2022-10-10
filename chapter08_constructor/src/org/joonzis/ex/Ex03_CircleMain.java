package org.joonzis.ex;

public class Ex03_CircleMain {
	public static void main(String[] args) {
		Ex03_Circle c = new Ex03_Circle();
		Ex03_Circle c2 = new Ex03_Circle(3);
		Ex03_Circle c3 = new Ex03_Circle(2, 2, 2);
		c.output();
		System.out.println("--------");
		c2.output();
		System.out.println("--------");
		c3.output();
	}
}
