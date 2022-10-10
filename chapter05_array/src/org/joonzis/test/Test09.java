package org.joonzis.test;

import java.util.*;

public class Test09 {
	public static void main(String[] args) {
		String[] subArr = { "Java", "Python", "Android", "JSP", "JAvascript" }; // 과목 선언
		int[] scoreArr = { 95, 88, 78, 62, 55 }; // 점수 선언

		Scanner sc = new Scanner(System.in); // scanner 선언

		int i = 0; // 전역변수 i 선언
		while (true) { // 반복문1(가장 큰 반복문이라 생각하세요)
			System.out.println("과목명을 입력하세요");
			String sub = sc.nextLine();
			i = 0; // i 배열의 인덱스가 반복문돌리면 계속 커질것을 대비해서 초기화 시키기
			if (sub.equals("그만")) { // 그만 이라 하면 큰 반복문 멈춤
				break; //
			} //
			while (i < subArr.length) { // 반복문2 반복문 안에 반복문
				if (!sub.equals(subArr[i])) { // 이 반복문은 그만과 과목명 이외에 것이 나오면 큰 반목분 처음으로 다시 보내기 위해 사용 //
					i++;
					if (i >= subArr.length) { // 2중 조건문 subArr[0] 부터 subArr[4]까지 반복 비교를 시켜본후 어느것과도 겹치지 않으면 잘못 입력한것을 알려주는
												// 함수에요
						System.out.println("다시"); // 많이 어렵긴 할텐데 걍 그러려니 하고 넘겨유
					}

				} else {
					break;
				} // 반복문2 를 멈추라는 것 고로 전체 반복문이 멈추지는 않는디

			}
			while (i < subArr.length) {
				if (sub.equals(subArr[i])) { // "그만"을 입력하지도 오타를 입력하지도 않았기에 우리는 출력을 해야해요
					System.out.println(subArr[i] + "의 점수는 : " + scoreArr[i]); // 역시 마찬가지로 subArr[0] 부터 subArr[4]까지 반복
																				// 비교를 시켜본후 일치하는것을 출력
					break;
				} else {
					i++; // 일치하지 않으면 i를 하나 올려서 계속 반복해본다 어디까지????? 위에 while(i<subArr.length)까지로 정해놨다 이 작업이
							// 끝나면 맨처음 반복문으로 올라가서 다시 시작
				}

			} // 대충이런식으로 만들어 봤는데 이해못하겠다 싶으면 강사님이 올리신 함수 사용해서 쉽게 가도 되긴한데 굳이 우리가 배워본것만으로 해보고 싶은
				// 객기랄까요...
		} // 더 이해 안되면 카톡해도 되유 시간나면 봐줄게 ㅎ

		sc.close();
	}
}

//////   이거는 맨처음에 생각하기 귀찮아서 대충 노가다식으로 만든건데 이게 이해하기는 쉬울듯?

//if(sub.equals(subArr[0])) {
//	System.out.println(subArr[0] + "의 점수는 : " + scoreArr[0]);
//	System.out.println("과목명을 입력하세요");
//	sub = sc.nextLine();
//	continue;
//	
//}else if(sub.equals(subArr[1])) {
//	System.out.println(subArr[1] + "의 점수는 : " + scoreArr[1]);
//	System.out.println("과목명을 입력하세요");
//	sub = sc.nextLine();
//	continue;
//	
//}else if(sub.equals(subArr[2])) {
//	System.out.println(subArr[2] + "의 점수는 : " + scoreArr[2]);
//	System.out.println("과목명을 입력하세요");
//	sub = sc.nextLine();
//	continue;
//	
//}else if(sub.equals(subArr[3])) {
//	System.out.println(subArr[3] + "의 점수는 : " + scoreArr[3]);
//	System.out.println("과목명을 입력하세요");
//	sub = sc.nextLine();
//	continue;
//	
//}else if(sub.equals(subArr[4])) {
//	System.out.println(subArr[4] + "의 점수는 : " + scoreArr[4]);
//	System.out.println("과목명을 입력하세요");
//	sub = sc.nextLine();
//	continue;
//	
//}else if(sub.equals("그만")){
//	break;
//}
//else{
//	System.out.println("다시 입력하세요.");
//	sub = sc.nextLine();
//	continue;
//}