package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {

		/*
		NonStaticMethod n = new NonStaticMethod();
		
		// ---- NosStaticMethod ----
		
		// 1.매개변수도 없고 반환값도 없는 메소드 호출
		n.method1();
		//n.method1(10); - 매개변수 없으니까 당연히안됌

		// 2.매개변수 없고 반환값은 있는 메소드
		//n.method2();
		// int str = n.method2(); - 자료형 안맞으니까 당연히안됌
		//String str = n.method2();
		//System.out.println(str);
		
		// 3. 매개변수는 있고 반환값은 없는 메소드
		//n.method(3); - 매개변수 두개니까 당연히 하나쓰면 안됌
		//int a = n.method3(10, 20); - 리턴값 없어서 안됌
		n.method3(10, 0);
		
		// 4. 매개변수도 있고 반환값도 있는 메소드
		//char ch = n.method4("lemon", 1);
		//System.out.println(ch);
		//System.out.println(n.method4("lemon", 1));
		
		// 사용자에게 매개변수를 입력 받아서 해당 메소드 호출
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("인덱스값 입력 : ");
		int index = sc.nextInt();
		
		//System.out.println(n.method4(str, index));
		
		//여기서 유효성 검사 해보기
		//index값이 0이상이고 문자열 길이보다 작을때만 method4 실행
		
		//잘입력 : 메소드 실행
		//인덱스값 잘못입력 : 인덱스값이 부적절합니다.
		
		if (index >= 0 && index < str.length()) {
			System.out.println(n.method4(str, index));
		} else {
			System.out.println("인덱스 값이 부적절합니다.");
		}
		*/
		
		// ----- StaticMethod -----
		// 생성없이 바로 호출 가능
		
		StaticMethod.method1();
		
		StaticMethod.method2();
		System.out.println(StaticMethod.method2()); // return값은 출력하지 않으면 보이지 않는다.
		
		StaticMethod.method3("차은우");
		
		System.out.println(StaticMethod.method4("kiwi", "kiwi"));
		
		// ----- OverloadingTest -----
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "     ");
		ot.test("     ", 10);
		ot.test("ㅇㅇㅇ");
		
		//오버로딩의 대표적인 예 => print()
		System.out.println(10);
		System.out.println("ㄴㄴ");
		System.out.println(0.0);
		
	}

}
