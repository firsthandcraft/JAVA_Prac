package step1;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력한 숫자 만큼 문장을 반복하기 
		
				int hello;
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자을 입력 ");
				hello =sc.nextInt();
				
				for(int i=1; i<=hello; i++) {
					System.out.println("Hello World");
				}
				
	}

}
