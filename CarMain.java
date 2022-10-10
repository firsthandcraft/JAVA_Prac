package org.joonzis.test;

public class CarMain {
	public static void main(String[] args) {

		Car c = new Car();
		c.setFields("k7", "black");
		c.output();

		Car c2 = new Car();
		c2.setFields("k9", "white", 2020);
		c2.output();
	}
}
