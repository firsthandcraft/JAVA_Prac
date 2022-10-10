package step1;

import java.util.Scanner;

public class signInSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//등록(아이디, 전화번호 이름 주소), 전체출력, 종료
				System.out.println("계산기 만들기");
				
				Scanner sc =new Scanner(System.in);
				//계산기 만들기
				
				boolean flag=true ;
				String i;
				String n;
				int j=0,k=0;
				

				
				while(flag) {
					System.out.println("더하기");
					System.out.println("빼기");
					System.out.println("곱하기");
					System.out.println("나누기");
					System.out.println("종료");
					
					i =sc.next();
					
					switch (i) {
						case "더하기":
							System.out.println("숫자를 입력하세요 : ");
							j=sc.nextInt();
							System.out.println("숫자를 입력하세요 : ");
							k=sc.nextInt();
							System.out.println(j+k);
							break;
						 
						case "빼기":
							System.out.println("숫자를 입력하세요 : ");
							j=sc.nextInt();
							System.out.println("숫자를 입력하세요 : ");
							k=sc.nextInt();
							System.out.println(j-k);
							break;
						case "곱하기":
							System.out.println("숫자를 입력하세요 : ");
							j=sc.nextInt();
							System.out.println("숫자를 입력하세요 : ");
							k=sc.nextInt();
							System.out.println(j*k);
							break;
						case "나누기":
							System.out.println("숫자를 입력하세요 : ");
							j=sc.nextInt();
							System.out.println("숫자를 입력하세요 : ");
							k=sc.nextInt();
							System.out.println((float)j/k);
							break;
						case "종료":
							flag=false;
							System.out.println("종료");
						 break;
						 
						default:
							System.out.println("오류 = 더하기/빼기/곱하기/나누기/종료 중에서  입력");
					}//switch
					
				}//while 
	}

}
