package org.joonzis.ex;

public class Ex03_RecursiveClass {
	static int count = 0;
	//재귀 메소드 (재귀 호출로 반복문 형식 사용
	static void recursive() {
		System.out.println("recursive() call");
		count ++;
		if(count == 5) {
			return;
		}
		recursive();
	}
	
	public static void main(String[] args) {

		for(int i =0; i<=5; i++) {
			System.out.println("333");
		}
		
		}
}
