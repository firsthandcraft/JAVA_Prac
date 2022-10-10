package step1;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홀수만 나오게 만들기 
				Scanner sc = new Scanner(System.in);
				System.out.println("1~100까지의 홀수숫자를 입력 ");
				int n =sc.nextInt();
				int i;
	
				if(n%2 !=0) {
				for(i=1; i<=n; i++) {
					//!=
					//%
					
					if(i%2 != 0) {
					System.out.println(i+"\t");		
					}
				
					
				}
				} else {
					System.out.println("홀수를 입력하세요");

				}
				
				//
			}

		}
