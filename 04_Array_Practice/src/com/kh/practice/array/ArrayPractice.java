package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for (int j = 0 ; j < arr.length ; j++) {
			for (int i = 10 ; i > arr.length ; i--) {
				arr[j] = i;
			}
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice4() {
		
		// 배열 생성 및 값 대입
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};

		// 귤일때만 출력
		for (int i = 0 ; i < fruits.length ; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
			}
		}
		System.out.println();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print(str+"에"+ch+"가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == ch)
				System.out.print(i + " ");

		}
		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == ch)
				count++;

		}
		System.out.print("i 개수 : " + count);

	}
	
	public void practice6() {
		
		char[] day = {'월', '화', '수', '목', '금', '토', '일'};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num >= 0 && num <= 6) {
			System.out.println(day[num]+"요일");
		}
		System.out.println("잘못 입력하셨습니다.");
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			int indexNum = sc.nextInt();
			arr[i] = indexNum;
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.print("총 합 : " + sum);
		
	}
	
	public void practice8() {
		
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		
		for (int i = 0 ; i <= arr.length ; i++) {
			if (i <= (num/2)) {
				arr[i] = i+1;
			}
			if (i > (num/2)) {
				arr[i] = i-1;
			}
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
			
		
		
		
	}
	
	
}
