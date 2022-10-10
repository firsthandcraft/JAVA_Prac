package org.joonzis.test;

public class DogMain {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setDog("초코", 8);
		d.info();

		Dog d2 = new Dog();

		d2.setDog("달이", 9, "포메라니언");
		d2.info();

	}
}
