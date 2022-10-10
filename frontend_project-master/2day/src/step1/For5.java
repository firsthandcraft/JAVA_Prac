package step1;

public class For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 1단끼리 2단끼리...

		int i,j;
		for(i=0; i<10; i++) {//1단_9단
			for(j=2;j<10;j++) {//2-9반복
				if(i==0) {//0일때는 단으로 반복 1단일때 상단의 for문 실행
					System.out.println(j+"단\t");	
				} else {
					System.out.println(j+"*"+i+"="+(j*i+"\t"));	
				}
			}
			System.out.println();
		}
	}

}
