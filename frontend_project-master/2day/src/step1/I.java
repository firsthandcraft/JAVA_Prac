package step1;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 부터 입력받은 숫자를 구구단
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자을 입력(2~9)");
		int i =sc.nextInt();
		int a;
		
		System.out.println("출력할 내용은:"+i+"단입니다.");

		for(a=1; a<=9; a++) {
			System.out.println(i+"*"+a+"="+i*a);		}
		

		
		
		
	}

	

}
