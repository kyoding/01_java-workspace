package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 *  * 산술연산자
	 *  +,-,*,/,%  
	 *  
	 *  *,/,% -> +-
	 */

	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		//System.out.println("num1 + num2 = " + num1 + num2);
		System.out.println("num1 + num2 = " + (num1 + num2)); //13
		//System.out.println("num1 - num2 = " + num1 - num2);
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2)); // 결과값은 관계없지만 가독성을 위해 괄호안에
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기 했을때 몫
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기 했을때 나머지
		
		//값 % 2 == 0 는 짝수
		//값 % 2 == 1 는 홀수
		
		//값 % 5 == 0 는 5의 배수
		//값 % 3 == 0 는 3의 배수
		
	}
	
	public void quiz1(){
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; // a=6, b=10, c=16
		int d = c / a;	// a=6, b=10, c=16, d=2
		int e = c % a;	// a=6, b=10, c=16, d=2, e=4
		
		int f = e++;	// a=6, b=10, c=16, d=2, e=4(5), f=4
		
		int g = (--b) + (d--); // a=6, b=9, c=16, d=2(1), d=5, e=5, f=4, g=11
		int h = 2; // a=6, b=9, c=16, d=1, d=5, e=5, f=4, g=11, h=2
		
		// a=6(7), b=9, c=15, f=4      g=11(10) d=1 e=6   h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		//		  6   + 9 / (15  / 4)   (11  - 1) % ( 6  + 2)
		//		  6   + 9 /	    3	  *		10	  %		8
		//		  6   +		  3		  *		10	  %		8
		//		  6   +				30			  %		8
		//		  6   +						6
		//					12
		
		// a=7, b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=12
	
	
		System.out.println("a : " + a); 
		System.out.println("b : " + b); 
		System.out.println("c : " + c);	
		System.out.println("d : " + d);	
		System.out.println("e : " + e);	
		System.out.println("f : " + f);	
		System.out.println("g : " + g);	
		System.out.println("h : " + h);	
		System.out.println("i : " + i);	
	}
	
	
}
