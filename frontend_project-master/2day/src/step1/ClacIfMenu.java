package step1;

import java.util.Scanner;

public class ClacIfMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//등록(아이디, 전화번호 이름 주소), 전체출력, 종료
		//while문 반복문 -> for 문 // switch문을 if else문으로 
				System.out.println("123중에 하나를 입력");

				
				Scanner sc =new Scanner(System.in);
				//main은 전역변수 (소멸되는 변수가 지역변수) 초기화 값이 필요하다ㅣ.
				
				//변수: 아이디 전화번호 이름 주소
				String id =null;
				String name=null;
				String add=null;
				String tel=null;
				
				boolean flag=true ;
				int i=0;


				while(flag) {
					System.out.println("1.등록");
					System.out.println("2.전체출력");
					System.out.println("3.종료");
					
					i =sc.nextInt();
					
					if(i==1) {
						System.out.println("아이디를 입력:");
						id  =sc.next();
						System.out.println("이름 입력:");
						name =sc.next();
						System.out.println("주소 입력:");
						add =sc.next();
						System.out.println("전화번호 입력:");
						tel =sc.next();
						
					}else if(i==2){
						// 아이디 이름 주소 전화번호에 null값인경우 "등록을 해주세요" 작성해보기
						if(tel==null || id==null || name==null || add==null) {
							System.out.println("등록을 작성해주세요");
					
						} else {System.out.println("id는"+id+"name은"+name+"주소는"+add+"전화번호는"+tel);
						}
						
					}else if(i==3) {
						flag=false;
						System.out.println("종료");
					}else {
						System.out.println("1~3까지 숫자를 입력하세요");
						
					} sc.close();
					
					
				}//while
	}

}
