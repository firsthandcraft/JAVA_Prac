package org.joonzis.ex;
import java.util.Scanner;
public class Ex06_break {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력");
		int i=0;
		while(true) {
			String id =sc.nextLine();
			//id가 admin이면 id일치 출력후 반복문 종료
			//알차하지 않으면 다시 입력하세요 출력
			if(id.equals("admin")) {
				System.out.println("id일치");
				break;
			}else {
				System.out.println("다시 입력해");
				 i++;
				 if(i==10) {
					 System.out.println("그만!");
					 break;
				 }
			}
		}
		
		
		
		
	sc.close();	
	}
}
