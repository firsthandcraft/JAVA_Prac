package org.joonzis.ex;


// 메소드 오버로딩
//1. 메소드들의 이름이 같다.
//2. 매개변수가 다르다.
//3. 리턴은 상관없다.

public class Ex01_Rect {
	int width;
	int height;
	
	boolean isSquare;
	
	void setFields(int w,int h) {
		width = w;
		height = h;
		
	    isSquare = (w==h) ? true :false;
		
	}
	
	void setFields(int side) {
		
		width = side;
		height = side;
		isSquare = true;
	}
	
	int calcArea() {
		return width * height;
	}
	
	void output() {
		
		System.out.println("너비 : "+ width);
		System.out.println("높이 : "+ height);
		System.out.println("크기 : "+ calcArea());
		System.out.println(isSquare ? "정사각형" : "정사각형 아님");
	}
	
	
	
	
	
}
