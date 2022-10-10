package org.joonzis.test;
import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		//월을 입력받아 출력
		System.out.println("월을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : case 3: // 이렇게 사용이 가능했구나!!!!!!!
			System.out.println(a + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(a + "월은 28일까지 있습니다.");
			break;
		case 4:
			System.out.println(a + "월은 30일까지 있습니다.");
			break;
		case 5:
			System.out.println(a + "월은 31일까지 있습니다.");
			break;
		case 6:
			System.out.println(a + "월은 30일까지 있습니다.");
			break;
		case 7:
			System.out.println(a + "월은 31일까지 있습니다.");
			break;
		case 8:
			System.out.println(a + "월은 31일까지 있습니다.");
			break;
		case 9:
			System.out.println(a + "월은 30일까지 있습니다.");
			break;
		case 10:
			System.out.println(a + "월은 31일까지 있습니다.");
			break;
		case 11:
			System.out.println(a + "월은 30일까지 있습니다.");
			break;
		case 12:
			System.out.println(a + "월은 31일까지 있습니다.");
			break;
		default :
			System.out.println("잘못입력함");
			break;
			
			
		
		}
		sc.close();
		
	}
	
}
