package org.joonzis.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		Ex01_Rect rc = new Ex01_Rect();
		Ex01_Rect rc1 = new Ex01_Rect(10);
		Ex01_Rect rc2 = new Ex01_Rect(15, 20);
		
		
		rc.output();
		System.out.println("-----");
		rc1.output();
		System.out.println("-----");
		rc2.output();
		
		
		
	}
}
