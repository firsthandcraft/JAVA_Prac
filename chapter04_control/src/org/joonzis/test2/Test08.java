package org.joonzis.test2;
import java.util.*;
public class Test08 {

	// up down 게임
		public static void main(String[] args) {
	
			int score = (int)(Math.random() *100)+1;
			System.out.println("맞춰보자");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int i = 0;
			while(true) {
				if(score>a) {
					System.out.println("UP");
					a = sc.nextInt();
					i++;
				}else if(score <a) {
					System.out.println("down");
					a = sc.nextInt();
					i++;
				}else {
					System.out.println("answer");
					System.out.println("총 " + (i+1) +"회만에 성공" );
					break;
				}
				
				
			}
			
			
			
			sc.close();
			
		}
	
}
