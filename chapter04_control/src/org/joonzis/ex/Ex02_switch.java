package org.joonzis.ex;

import java.util.*;
public class Ex02_switch {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		switch(age/10) {
		case 0:
			System.out.println("미성년자");
			break;
		case 1:
			System.out.println("미성년자");
			break;
		case 2:
			System.out.println("20대임");
			break;
		case 3:
			System.out.println("30대임");
			break;
		case 4:
			System.out.println("40대임");
			break;
		case 5:
			System.out.println("50대임");
			break;
		default : 
			System.out.println("60대 이상");
			break;	
		}
	
	sc.close();
	
	}
}
