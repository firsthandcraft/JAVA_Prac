package step1;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���丮�� �Լ� ����� 
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		int n =sc.nextInt();
		int i;
		int fac= 1; //���丮���� ������ ���� ����� �ʱⰪ�� 1�� ��
		
		System.out.println("");

		//���丮�� �Լ� ����� 
		//1*2 . 1*2*3. 1*2*3*4...
		
		for(i=1; i<=n; i++) {
			fac*=i;
			System.out.println(n+"!---->>"+fac);		
		}
		

	}

}