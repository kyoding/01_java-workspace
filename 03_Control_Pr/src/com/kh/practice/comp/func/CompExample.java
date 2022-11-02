package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			if (i % 2 == 1) {
				System.out.print("박");
			} else if (i % 2 == 0) {
				System.out.print("수");
			} 
		}
		System.out.print("양수가 아닙니다.");
	}
	
	public void practice2() {


	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		for (int i = 0 ; i < str.length() ; i++) {
			
		}
		
		
		
		
		
	}
	
	public void practice4() {
		
	}
	
	
	
	

}
