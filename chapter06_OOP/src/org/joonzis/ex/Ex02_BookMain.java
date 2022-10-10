package org.joonzis.ex;

public class Ex02_BookMain {
	public static void main(String[] args) {
		
		Ex01_Book myBook = new Ex01_Book();
		myBook.title = "자바의 정석";
		myBook.writer = "남궁성";
		myBook.price = 35000;
		myBook.isBestSeller = true;
		
		myBook.info();
		
	}
}
