package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPracticePr {

	public void Pr1() {
		
		
		
	}
	
	public void Pr2() {
		// 배열 선언
		int[] arr = new int[10];
		// 값 대입 (역순으로)
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = 10-i;
		}
		// 배열 출력 
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void Pr3() {
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		// 배열 선언 및 할당
		int[] arr = new; 
		// 값 대입
		// 배열 출력
		for(int i = 0; i<arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
	
	public void Pr4() {
		
	}
	
	public void Pr10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		//원본배열
		char[] arr = new char[idNum.length()];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = idNum.charAt(i);
		}
		
		//복사본 배열
		char[] arrCopy = arr.clone();
		
		for(int i = 8 ; i < arrCopy.length ; i++) {
			arrCopy[i] = '*';
		}
		
		for(int i = 0; i < arrCopy.length ; i++) {
			System.out.print(arrCopy[i]);
		}
		
	}
	
	
}
