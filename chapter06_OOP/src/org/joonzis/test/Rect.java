package org.joonzis.test;
import java.util.*;
public class Rect {

	Scanner sc = new Scanner(System.in);
		
		int width;
		int height;
		
		void init() {
			System.out.println("너비입력");
			 width = sc.nextInt();
			System.out.println("높이입력");
			 height = sc.nextInt();
			
			
		}
		
		
		void calcArea() {
			
			System.out.println("크기 : " + (width*height));
			
		}
		
		void info() {
			System.out.println("너비 : " + width);
			System.out.println("높이 : " + height);
			calcArea();
			
		}
		
		
}
