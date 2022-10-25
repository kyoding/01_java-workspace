package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void inputTest1() {
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		// sc.nextLine(); nextInt다음 nextLine이 아닌 다른 것이 나올 경우는 nextLine을 한번 더 써줄 필요가 없다

		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("키 "+height+"cm인 "+age+"살"+gender+"자 "+name+"님 반갑습니다");
		
		sc.close();
	}

}
