package step1;

import java.util.Scanner;

public class signInIfver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���(���̵�, ��ȭ��ȣ �̸� �ּ�), ��ü���, ����
		//while�� �ݺ��� -> for �� // switch���� if else������ 
				System.out.println("123�߿� �ϳ��� �Է�");
				System.out.println("1.���");
				System.out.println("2.��ü���");
				System.out.println("3.����");
				
				Scanner sc =new Scanner(System.in);
				//main�� �������� (�Ҹ�Ǵ� ������ ��������) �ʱ�ȭ ���� �ʿ��ϴ٤�.
				
				//����: ���̵� ��ȭ��ȣ �̸� �ּ�
				String id =null;
				String name=null;
				String add=null;
				String tel=null;
				
				//String [] arr={"1.���","2.��ü���","3.����"};
				int j= 0;

				for (int i = 0; i <4; i++) {
					
				j =sc.nextInt();
					if(j==1) {
						System.out.println("���̵� �Է�:");
						id  =sc.next();
						System.out.println("�̸� �Է�:");
						name =sc.next();
						System.out.println("�ּ� �Է�:");
						add =sc.next();
						System.out.println("��ȭ��ȣ �Է�:");
						tel =sc.next();
						System.out.println("�Ϸ�");
						
					}else if(j==2){
						
						if(id ==null || name==null || add==null || tel==null) {
							System.out.println("����� �ۼ����ּ���");

						} else {
							System.out.println("id : "+id+", name : "+name+", add : "+add+", tel : "+tel);

						}
						
					}else if(j==3) {
						i = 4;
						System.out.println("����");
					
					}else {
						System.out.println("1~3���� ���ڸ� �Է��ϼ���");
						System.out.println("1.���");
						System.out.println("2.��ü���");
						System.out.println("3.����");
						
					} 
					i=0;
					System.out.println("1~3���� ���ڸ� �Է��ϼ���");
					System.out.println("1.���");
					System.out.println("2.��ü���");
					System.out.println("3.����");
				}
				
			
	}

}