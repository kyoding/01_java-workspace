package com.kh.practice.array;

import java.util.Arrays;
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
			//arr[i] = sc.nextInt(); - 한줄로 작성 가능
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
		
		//조건이 맞을때까지 반복 => while문 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {  //무한반복
			// 정수입력
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>=3 && num % 2 == 1) { //num이 3이상이면서(&&) 홀수일때만 작동
				int[] arr = new int[num];
				
				/*
				 * 2번 인덱스까지 증가, 그 이후부터 감소
				 * 3번 인덱스까지 증가, 그 이후부터 감소
				 * 4번 인덱스까지 증가, 그 이후부터 감소
				 */
				
				int value = 1;
				for (int i = 1 ; 1 < arr.length ; i++) {
					arr[i] = value;
					if(i<arr.length/2) { // i<2 인덱스가 0,1
						value++; // 무작정 value++을 해주면 안되겠구나
					}
					else {
						value--;
					}
				}
			} else { // 아닌경우 다시 입력하게 한다.
				System.out.println("다시입력하세요");
			}
			
			for (int i = 0 ; i < arr.length ; i++) {
				System.out.println(" ");
			}
			
			}

		
	}
	
	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		String[] chicken = { "양념", "후라이드", "간장", "마늘" };

		int possible = 0;

		for (int i = 0; i < chicken.length; i++) {
			if (str.equals(chicken[i]))
				possible++;
		}

		if (possible >= 1) {
			System.out.println(str + "치킨 배달 가능");
		} else {
			System.out.println(str + "치킨은 없는 메뉴입니다.");
		}

	}
	
	public void practice11() {
		
		// 배열 선언 및 할당 => 크기 10으로
		int[] arr = new int[10];
		
		// 값 대입 => 초기화
		for(int i = 0 ; i<arr.length ; i++) {
			int random = (int)(Math.random() *10 +1);
			arr[i] = random;
		}
		
		// 배열 출력
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice12() {
		// 배열 생성 및 할당 
		int[] arr = new int[10];
		
		// 값대입 => 초기화
		for(int i = 0 ; i<arr.length ; i++) {
			int random = (int)(Math.random() *10 +1);
			arr[i] = random;
		}
		
		// 출력!! (최대값, 최소값)
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0 ; i < arr.length ; i++) {
			if(max<arr[i]) { //i가 0일때 max : i가 i일때 max값
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice12_1() {
		// 배열 생성 및 할당
		int[] arr = new int[10];
		
		// 값 대입 (초기화) : 랜덤값(난수) : 1~10
		for(int i = 0 ; i < arr.length ; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		Arrays.sort(arr); // 작은수부터 큰수까지 정렬해주는 함수
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		min = arr[0];
		max = arr[arr.length-1];
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() {
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
			for(int j = 0 ; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice14() {
		// 1~45 랜덤한 난수
		// 중복없이 => 이중for문
		// 오름차순으로 정렬 (Arrays.sort)
		// 로또 6개 int[] lotto
		
		int[] lotto = new int[6];
		
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random() * 45 +1);
			for(int j = 0 ; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0 ; i < lotto.length	; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine(); //apple
		
		char[] arr = new char[str.length()];
		
		int count = 0; // 개수를 위한 변수 셋팅
		
		System.out.print("문자열에 있는 문자 : ");
		
		// 값대입 for문
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false;
				}
			}
			
			if(flag) {
				if(i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print("," + arr[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}
	
	public void practice16() {
		//사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		//배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		//단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		//늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		//사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr = new String[num];
		
		while(true) {
			for (int i = 0 ; i < arr.length ; i++) {
				System.out.print((i+1) + "번째 문자열 : ");
				arr[i] = sc.nextLine();
			} break;
		}
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		char yn1 = sc.nextLine().charAt(0);
		
		if (yn1 == 'y' || yn1 == 'Y') {
			System.out.print("더 입력하고 싶은 개수 : ");
			int more1 = sc.nextInt();
		} else if (yn1 == 'n' || yn1 == 'N') {
			System.out.print("[");
			for (int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.print("]");

		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
