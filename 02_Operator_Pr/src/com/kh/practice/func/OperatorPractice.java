package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		//키보드로 입력받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
		
		sc.close();
		
		
	}
	
	public void practice2() {
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
		//양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : (num < 0) ? "음수다" : "0이다";
		
		System.out.println(result);
		
		sc.close();
		
	}
	
	public void practice3() {
		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = ((num % 2) == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
		
		sc.close();
		
	}
	
	public void practice4() {
		//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		String result1 = (people / candy+"");
		String result2 = (people % candy+"");
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남은 사탕 개수 : " + result2);
		
		sc.close();
		
	}
	
	public void practice5() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		//이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요. (소문자도 입력허용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int clss = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String result = (gender == 'M' || gender == 'm') ? " 남학생" : " 여학생";
		
		
		System.out.println(grade + "학년 " + clss + "반 " + number + "번 " + name + result + "의 성적은 " + score + "이다.");
		
		sc.close();
		
	}
	
	public void practice6() {
		//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		//성인(19세 초과)인지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		
		System.out.println(result);
		
		sc.close();
		
		
	}
	
	public void practice7() {
		//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng +  math;
		double average = sum/3;

		
		//40이상 , 평균60이상
		String result = (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) ? "합격" : "불합격";

		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n" , average);
		System.out.println(result);
		
		sc.close();

	}
	
	public void practice8() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char ch = sc.nextLine().charAt(7);
		
		String result = (ch == '1') ? "남자" : "여자";
		
		System.out.println(result);
		
		sc.close();
		
		
	}
	
	
	
	
	
	
	
	

}
