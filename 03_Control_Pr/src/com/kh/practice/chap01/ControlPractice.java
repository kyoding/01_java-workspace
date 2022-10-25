package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("입력메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제메뉴입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int score = kor + math + eng;
		int average = (kor + math + eng)/3;
		
		if (average >= 60 && kor >= 40 && math >= 40 && eng >= 40) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + score);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int season = sc.nextInt();
		
		switch(season) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(season + "월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(season + "월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(season + "월은 가을입니다.");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(season + "월은 겨울입니다.");
			break;
		default :
			System.out.println(season + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		String myId = "kh";
		String myPw = "kh123";
		
		if (id.equals("kh")) {
			if (pw.equals("kh123")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	// 6번부터 하면 됌

}
