package org.zoonzis.test;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//06. 하이픈 없이 주민등록번호를 입력받아 남자 여자 출력하기
		System.out.println("-없이 주민등록번호를 입력하세요.");
		String a = sc.nextLine();
		
		if(a.substring(6,7).equals("1") || a.substring(6,7).equals("3") ) {
			System.out.println("남자");
		}else if(a.substring(6,7).equals("2") || a.substring(6,7).equals("4")) {
			System.out.println("여자");
		}
		sc.close();
			 
	
	}
}
