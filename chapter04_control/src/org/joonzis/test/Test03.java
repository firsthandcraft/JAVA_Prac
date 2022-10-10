package org.joonzis.test;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		//나이를 입력받아 7이하면 미취학 13이하면 초딩 16이하면 중딩 19 이하면 고딩 나머지는 성인
		Scanner sc =  new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		if(age<=7) {
			System.out.println("미취학 아동");
		}else if(age<=13) {
			System.out.println("초등학생");
		}else if(age<=16) {
			System.out.println("중학생");
		}else if(age<=19) {
			System.out.println("고등학생");
		}else {
			System.out.println("성인");
		}
		sc.close();
	}

}
