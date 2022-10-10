package org.joonzis.test2;

public class Test05 {
	public static void main(String[] args) {
		
		int sum = 0;
		int sum1 = 0;
		int i=0;
		
		for(i =1; i<=100;i++) {
			
			
			
			if(i%2==0) {
			sum = sum +i;}
			else {
				sum1= sum1 +i;
			}
		}
		
			
		
		System.out.println(sum + "      "+sum1);
	}
	
}
