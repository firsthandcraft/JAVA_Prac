package org.joonzis.test2;

public class Test04 {
	public static void main(String[] args) {
		//구구단 출력2
		
		for (int i =1; i<=9; i++) {
			
			for(int j =2; j<=9; j++) {
				System.out.print(" "+j +" * "+ i +" = "+ (i*j));
			}
			System.out.println();
		}
		
	}
}
