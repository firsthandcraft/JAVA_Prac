package step1;

import java.util.Scanner;

public class singIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���(���̵�, ��ȭ��ȣ �̸� �ּ�), ��ü���, ����
		System.out.println("123�߿� �ϳ��� �Է�");
		
		Scanner sc =new Scanner(System.in);
		//main�� �������� (�Ҹ�Ǵ� ������ ��������) �ʱ�ȭ ���� �ʿ��ϴ٤�.
		//����: ���̵� ��ȭ��ȣ �̸� �ּ�
		String id =null;
		String name=null;
		String add=null;
		String tel=null;
		
		boolean flag=true ;
		int i=0;

		
		while(flag) {
			System.out.println("1.���");
			System.out.println("2.��ü���");
			System.out.println("3.����");
			
			i =sc.nextInt();
			
			//if
			
			
			switch (i) {
				case 1:
					System.out.println("���̵� �Է�:");
					id  =sc.next();
					System.out.println("�̸� �Է�:");
					name =sc.next();
					System.out.println("�ּ� �Է�:");
					add =sc.next();
					System.out.println("��ȭ��ȣ �Է�:");
					tel =sc.next();
					
					break;
				 
				case 2:
					// ���̵� �̸� �ּ� ��ȭ��ȣ�� null���ΰ�� "����� ���ּ���" �ۼ��غ���
					if(tel==null || id==null || name==null || add==null) {
						System.out.println("����� �ۼ����ּ���");
				
					}else {System.out.println("id��"+id+"name��"+name+"�ּҴ�"+add+"��ȭ��ȣ��"+tel);
					}
				break;
				 
				case 3:
					flag=false;
					System.out.println("����");
				 break;
				 
				default:
					System.out.println("1~3���� ���ڸ� �Է��ϼ���");
			}//switch
			
			
			 
			
			
		}//while 
		
	}

}