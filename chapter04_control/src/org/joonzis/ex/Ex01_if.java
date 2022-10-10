package org.joonzis.ex;

public class Ex01_if {
	public static void main(String[] args) {
		/*
		 * if문
		 * 
		 * if(조건식){
		 *  실행문;
		 * }
		 * 
		 * if(조건식){
		 * 
		 * 실행문;
		 *  }else if(조건식){
		 *  
		 *  실행문;
		 *  
		 *  }else{
		 *  실행문;
		 *  }
		 */
		
		int num = 20;
		
		if(num>0) {
			System.out.println("+");
		}else if(num < 0) {
			System.out.println("-");
		}else {
			System.out.println("0");
		}
		
		
	}
		
}
