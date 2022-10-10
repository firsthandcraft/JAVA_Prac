package org.joonzis.ex;

public class TestOperMain {
	public static void main(String[] args) {
		TestOper to = new TestOper();
		
		to.plus(10, 20);
		to.minus();
		to.multi();
		System.out.println("나누기 : "+to.div());
	}
}
