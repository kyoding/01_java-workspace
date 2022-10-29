package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요

		// ex.
		// 1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
		// 1 2 3 4 1 이상의 숫자를 입력해주세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else
			System.out.print("1 이상의 숫자를 입력해주세요. ");

	}
	
	public void practice2() {
		//위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		//ex.
		//1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
		//1 2 3 4 1 이상의 숫자를 입력해주세요.
		//1이상의 숫자를 입력하세요 : 8
		//1 2 3 4 5 6 7 8
		
		Scanner sc = new Scanner(System.in);
		
		int j = 1;
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			j++;
			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " "); 
				} break;
			} else
				System.out.println("1 이상의 숫자를 입력해주세요. ");
			
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = num; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		} else
			System.out.print("1 이상의 숫자를 입력해주세요. ");
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int j = 1;
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			j++;
			if (num >= 1) {
				for (int i = num; i >= 1 ; i--) {
					System.out.print(i + " ");
				} break;
			} else
				System.out.println("1 이상의 숫자를 입력해주세요. ");
		}
		
	}
	
	public void practice5() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		//ex.
		//정수를 하나 입력하세요 : 8
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1 ; i <= num ; i++) {
				System.out.print(i);
				sum += i;
			}
			System.out.println("= " + sum);
		}
		///★★★★★★★★★보류
	
	
	public void practice6() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		//ex.
		//첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
		//두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
		//4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if ( num1 < 1 || num2 < 1) {
			for (int i = 1 ; i < num1 ; i++) {
				
			}
		}

		
		//★★★★★★★★★보류
		
		
	}
	
	public void practice7() {
		//위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		
		
		//★★★★★★★★★보류
	}
	
	public void practice8() {
		//사용자로부터 입력 받은 숫자의 단을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		for (int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
	}
	
	public void practice9() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		//숫자입력받기
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if (dan < 10) {
			for (int i = dan ; i < 10 ; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1 ; j < 10 ; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}
		}
	
	public void practice10() {
		//위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
		//“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if (dan < 10) {
				for (int i = dan; i < 10; i++) {
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);
					}
				}
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요");
			}
		}
	}
	
	public void practice11() {
	//사용자로부터 시작 숫자와 공차를 입력 받아
	//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
	//단, 출력되는 숫자는 총 10개입니다.
	//* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
	//ex) 2, 7, 12, 17, 22 …
	//5 5 5 5 => 여기서 공차는 5
	//ex.
	//시작 숫자 : 4
	//공차 : 3
	//4 7 10 13 16 19 22 25 28 31
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int difference = sc.nextInt();
		
		for (int i = 0 ; i < 10 ; i++) {
			for (int j = 0 ; j < 10 ; j++) {
				System.out.print(startNum + (difference * j) + " ");
			}
			break;
		}
	}
	
	public void practice12() {
		
	}
	
	////★★★★★★★★★보류
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			for (int j = 1 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = num ; i >= 1 ; i--) {
			for (int j = i ; j >= 1 ; j-- ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
		
		
		
	
	
	
	
}

