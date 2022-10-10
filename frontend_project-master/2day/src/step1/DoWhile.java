package step1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dowhile 문
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString;
		
		do {//실행문
			System.out.println(">");
			inputString=scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));{//조건식
			System.out.println("종료");
		}
		
		
	}

}
