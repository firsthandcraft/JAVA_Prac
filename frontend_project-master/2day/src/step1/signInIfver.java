package step1;

import java.util.Scanner;

public class signInIfver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//등록(아이디, 전화번호 이름 주소), 전체출력, 종료
		//while문 반복문 -> for 문 // switch문을 if else문으로 
				System.out.println("123중에 하나를 입력");
				System.out.println("1.등록");
				System.out.println("2.전체출력");
				System.out.println("3.종료");
				
				Scanner sc =new Scanner(System.in);
				//main은 전역변수 (소멸되는 변수가 지역변수) 초기화 값이 필요하다ㅣ.
				
				//변수: 아이디 전화번호 이름 주소
				String id =null;
				String name=null;
				String add=null;
				String tel=null;
				
				//String [] arr={"1.등록","2.전체출력","3.종료"};
				int j= 0;

				for (int i = 0; i <4; i++) {
					
				j =sc.nextInt();
					if(j==1) {
						System.out.println("아이디를 입력:");
						id  =sc.next();
						System.out.println("이름 입력:");
						name =sc.next();
						System.out.println("주소 입력:");
						add =sc.next();
						System.out.println("전화번호 입력:");
						tel =sc.next();
						System.out.println("완료");
						
					}else if(j==2){
						
						if(id ==null || name==null || add==null || tel==null) {
							System.out.println("등록을 작성해주세요");

						} else {
							System.out.println("id : "+id+", name : "+name+", add : "+add+", tel : "+tel);

						}
						
					}else if(j==3) {
						i = 4;
						System.out.println("종료");
					
					}else {
						System.out.println("1~3까지 숫자를 입력하세요");
						System.out.println("1.등록");
						System.out.println("2.전체출력");
						System.out.println("3.종료");
						
					} 
					i=0;
					System.out.println("1~3까지 숫자를 입력하세요");
					System.out.println("1.등록");
					System.out.println("2.전체출력");
					System.out.println("3.종료");
				}
				
			
	}

}
