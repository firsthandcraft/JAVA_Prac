package org.joonzis.ex;

import java.util.*;

public class Ex04_Book {
	/*
	 * 필드 책 제목 저자 가격 판매량 베스트셀러 판단
	 */

	Scanner sc = new Scanner(System.in);
	String title, writer;
	int price;
	int salesVolume;
	boolean isBestSeller;

	public Ex04_Book() {
//	title ="아몰랑";
//	writer = "작자미상";
//	price= 15000;
//	salesVolume = 2000;
//	isBestSeller = true;

	}

	public Ex04_Book(String t, int p) {
		title = t;
		price = p;
		writer = "작자미상";

	}

	public Ex04_Book(String title, String writer, int price) {

		this.title = title;
		this.writer = writer;
		this.price = price;

	}

	void setSalesVolume() {
		System.out.println("판매량을 입력하세요");

		int sales = sc.nextInt();
		if (sales >= 1000) {
			isBestSeller = true;
		} else {
			isBestSeller = false;
		}
	}

	void output() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("판매량 : " + salesVolume);
		System.out.println("베스트셀러 유무: " + (isBestSeller ? "베스트셀러" : "일반"));
	}

}
