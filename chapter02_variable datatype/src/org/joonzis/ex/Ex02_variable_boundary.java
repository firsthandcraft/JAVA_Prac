package org.joonzis.ex;

public class Ex02_variable_boundary {

	//전역 변수
	//지역 변수
	
	static double PI = 3.14; //전역
	
	public static void main(String[] args) {
		int value = 10; //지역
		int sum = value +20; //지역
		
		System.out.println(sum);
		//System.out.println(result); //result가 지역변수로 되어있기에 가져올수가 ㅇ벗
		System.out.println(PI);
	}
		
	public void local() {
		//int result = 100;
		
	}
	
}
