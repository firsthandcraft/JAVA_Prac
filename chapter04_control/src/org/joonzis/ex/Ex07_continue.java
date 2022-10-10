package org.joonzis.ex;

public class Ex07_continue {
	public static void main(String[] args) {
		 
		//특정 제외하고 싶은 데이터에 컨티뉴 씀
		
		// 1~10츨략
		int num=0;
		while(num<10) {
			num++;
			
			if(num%3==0) {
				continue;
			}else {
			System.out.println(num);
			
		}
			
			
			
			
			
			
		
		}
		
		
		
		for(int i =1;i<11;i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		
		}
		
		
		
		
		
		
	}
}
