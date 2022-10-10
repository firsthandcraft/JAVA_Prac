package step1;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이중 for 문 2단~9단 구구단 만들기 
		int i,j;
		for(i=2; i<10; i++) {//2단-9단
			for(j=1; j<10; j++) { //1-9번
				System.out.print(i+"*"+j+"="+i*j);	
			}
			//쓰면 옆으로 hr인 안되게 나온다.
			//ln은 줄바꿈처리하는것
			System.out.println();
		}
		
		
	}

}
