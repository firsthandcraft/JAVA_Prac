package org.joonzis.ex;

public class Ex04_BookMain {
	public static void main(String[] args) {

		Ex04_Book bk = new Ex04_Book();
		Ex04_Book bk1 = new Ex04_Book("java", 15000);
		Ex04_Book bk2 = new Ex04_Book("JSP", "배현우", 25000);

		bk.setSalesVolume();
		bk.output();

		bk1.setSalesVolume();
		bk1.output();

		bk2.setSalesVolume();
		bk2.output();

	}
}
