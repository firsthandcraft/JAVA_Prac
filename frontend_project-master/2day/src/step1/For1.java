package step1;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for �ݺ���
		int i, j,sum=0;
		//��������
		System.out.println("1~100������ ��");
		//1-100���� �ձ��ϱ� 
		
		//�ݺ����� ���� : ������ �������ٶ�� ������ ��Ȯ�� �ؾ� ���ѹݺ��� �ȵȴ�. 
		//�ݺ����� ����02 : �ݺ������� ���ǹ��� ������  ������ ������������.
				
		//��������
		for(i=1; i<=100; i++) {
			//sum=i;//100���� ������ ������
			sum+=i; // ������ ���Կ����� p.102
			//0=0+1
			//1=1+2
			//3=3+3
			//6=6+4
			//10=10+5 ...
			System.out.println("sum"+sum);
		}
		// ����ϱ�
//		System.out.println("sum"+sum);
		
		
		/* + ���� ���� ���� ������� �����Ҷ�
		 * for�� �ȿ����� ��밡��
		 * for(int i=1; i>=100; i++) {}
		 * 
		 * */
		
			
		//i�� �ʱⰪ�� 1�� �Ͽ� 2�� �����ϸ鼭 10�϶����� �ݺ��غ���
		for(j=1; j<=10; j+=2) {
			System.out.println(j);
		}
		System.out.println("----------------");
		
		//i�� �ʱⰪ�� 2�� �Ͽ� 2�� �����ϸ鼭 10�϶����� �ݺ��غ���
		for(j=2; j<=10; j+=2) {
			System.out.println(j);
		}
		System.out.println("----------------");
		
		//i�� �ʱⰪ�� 10�� �Ͽ� 1�� �����ϸ鼭 1���� ũ�ų� ���������� �ݺ�	
		for(j=10; j>=1; j--) {
			System.out.println(j);
		}
		System.out.println("----------------");
		
		
		
		
	}

}