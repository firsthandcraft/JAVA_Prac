package org.joonzis.ex;

public class Ex01_RextMain {
	public static void main(String[] args) {
		Ex01_Rect nemo1 = new Ex01_Rect();
		
		
		nemo1.setFields(10, 20);
		
		nemo1.output();
		
		Ex01_Rect nemo2 = new Ex01_Rect();
		nemo2.setFields(10);
		nemo2.output();
		
	}
}
