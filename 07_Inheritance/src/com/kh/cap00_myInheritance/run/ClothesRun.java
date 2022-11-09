package com.kh.cap00_myInheritance.run;

import java.util.Scanner;

import com.kh.cap00_myInheritance.model.vo.Bottom;
import com.kh.cap00_myInheritance.model.vo.Shoes;
import com.kh.cap00_myInheritance.model.vo.Top;

public class ClothesRun {

	public static void main(String[] args) {
		
		/*
		// Top 객체생성
		Top t = new Top("라운드넥 스웨터", 698000, "면", "골든구스", "다크그레이" , "봄/가을");
		
		// Bottom 객체생성
		Bottom b = new Bottom("데님 클래식 진", 234000, "데님", "스투시", "중청", 10);
		
		// Shoes 객체생성
		Shoes s = new Shoes("조던1 트래비스 스캇", 1915000, "가죽", "나이키", "밀리터리 블루", true);
		
		System.out.println(t.information());
		System.out.println(b.information());
		System.out.println(s.information());
		*/
		
		Top[] t = new Top[3];
		
		t[0] = new Top("라운드넥 스웨터", 698000, "면", "골든구스", "다크그레이", "봄/가을");
		t[1] = new Top("모노그램 모티프 카라티", 630000, "면", "버버리", "라이트그레이", "여름");
		t[2] = new Top("다운 푸퍼 숏 패딩", 119900, "오리털", "무신사스탠다드", "블랙", "겨울");
		
		Bottom[] b = new Bottom[3];
		
		b[0] = new Bottom("데님 클래식 진", 234000, "데님", "스투시", "중청", 10);
		b[1] = new Bottom("스웨트팬츠", 19000, "면", "유니클로", "라이트그레이", 9);
		b[2] = new Bottom("드라이핏 플렉스", 49800, "메쉬", "나이키", "블랙", 5);
		
		Shoes[] s = new Shoes[3];
		
		s[0] = new Shoes("조던1 트래비스 스캇", 1915000, "가죽", "나이키", "밀리터리 블루", true);
		s[1] = new Shoes("솔리드 슬립온", 69000, "면", "반스", "화이트", false);
		s[2] = new Shoes("에어포스1", 129000, "가죽", "나이키", "화이트", false);
		
		// 출력해보자
		
		System.out.println("========== 상의 목록 ==========");
		
		for (int i = 0 ; i < t.length ; i++) {
			System.out.println(t[i].information());
		}
		System.out.println();
		
		
		System.out.println("========== 하의 목록 ==========");
		
		for (int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i].information());
		}
		System.out.println();
		
		System.out.println("========== 신발 목록 ==========");
		
		for (int i = 0 ; i < s.length ; i++) {
			System.out.println(s[i].information());
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하시는 의류를 입력해주세요 : ");
		String choice = sc.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
