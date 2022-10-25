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
		
		// Id = "myId";
		// Pw = "myPassword12";
		
		if (id.equals("myId")) {
			if (pw.equals("myPassword")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String memberLv = sc.nextLine();
		
		switch(memberLv) {
		case "관리자" :
			System.out.println("회원관리");
		case "회원" : 
			System.out.println("게시글 관리 게시글 작성");
		case "비회원" :
			System.out.println("댓글 작성 게시글 조회");
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*2);
		
		if (bmi < 18.5) {
			System.out.print("저체중");
		} else if (bmi < 23) {
			System.out.print("정상체중");
		} else if (bmi < 25) {
			System.out.print("과체중");
		} else if (bmi < 30) {
			System.out.print("비만");
		} else
			System.out.print("고도비만");
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char airth = sc.nextLine().charAt(0);
		
		if (num1 > 0 && num2 >0) {
			if (airth == '+') {
			System.out.printf("%d + %d = %d",num1,num2,(num1+num2));
			} else if (airth == '-') {
			System.out.printf("%d - %d = %d",num1,num2,(num1-num2));
			} else if (airth == '*') {
			System.out.printf("%d * %d = %d",num1,num2,(num1*num2));
			} else if (airth == '/') {
			System.out.printf("%d / %d = %d",num1,num2,(num1/num2));
			} else if (airth == '%') {
			System.out.printf("%d % %d = %d",num1,num2,(num1%num2));
			}
		}
		else
			System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 : ");
		int midT = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int finalT = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		
		double midScore = midT * 0.2;
		double finalScore = finalT * 0.3;
		double homeworkScore = homework * 0.3;
		// double attendScore = attend;
		double total = midScore + finalScore + homeworkScore + attend;
		
		if (attend <= 14) {
			System.out.println("Fail [출석 회수 부족 (10/20)]");
			return;
		} else if (total >= 70) {
			System.out.println("========== 결과 ==========");
			System.out.println("중간고사 점수(20) : " + midScore);
			System.out.println("기말고사 점수(30) : " + finalScore);
			System.out.println("과제 점수(30) : " + homeworkScore);
			System.out.println("출석 점수(20) : " + attend);
			System.out.println("총점 : " + total);
			System.out.println("PASS");
			return;
		} else
			System.out.println("========== 결과 ==========");
			System.out.println("중간고사 점수(20) : " + midScore);
			System.out.println("기말고사 점수(30) : " + finalScore);
			System.out.println("과제 점수(30) : " + homeworkScore);
			System.out.println("출석 점수(20) : " + attend);
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달]");
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int choose = sc.nextInt();

		Run r = new Run();
		
		switch(choose) {
		case 1 :
			r.main_1();
			break;
		case 2 :
			r.main_2();
			break;
		case 3 :
			r.main_3();
			break;
		case 4 :
			r.main_4();
			break;
		case 5 :
			r.main_5();
			break;
		case 6 :
			r.main_6();
			break;
		case 7 :
			r.main_7();
			break;
		case 8 :
			r.main_8();
			break;
		case 9 :
			r.main_9();
			break;
		}
		
	}
	
}
