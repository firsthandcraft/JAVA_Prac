package org.joonzis.test;

import java.util.*;

public class RecursiveCall {

	static void recursive(int i) {

		if (i == 0) {

			return;

		} else {
			
			recursive(i - 1);
			System.out.println("Hello" + i);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.!!!");
		int n = sc.nextInt();
		recursive(n);

		sc.close();
	}
}
