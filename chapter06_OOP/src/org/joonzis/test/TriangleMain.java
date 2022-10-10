package org.joonzis.test;
import java.util.*;



class Triangle {
	
	
	Scanner sc = new Scanner(System.in);
	int width;
	int height;
	
	void init() {
		
		System.out.println("너비 입력");
		width = sc.nextInt();
		System.out.println("높이 입력");
		height = sc.nextInt();
		
		
	}
	void info() {
		System.out.println("너비 : " + width );
		System.out.println("높이 : " + height );
		calcArea();
	}
	
	void calcArea() {
		System.out.println("넓이 : " +  ((double)(width*height)/2));
	}
	
	
	
}




public class TriangleMain {
	public static void main(String[] args) {
		
		Triangle tr = new Triangle();
		
		tr.init();
		tr.info();
	}
}
