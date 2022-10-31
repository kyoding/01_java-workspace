package com.kh.array;

import java.util.Scanner;

public class A_Array {
	// 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	// int a = 10, 20, 30, 40; x
	
	// 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념
	//		 "같은 자료형의 값" 으로만 담을 수 있다.
	//		 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작!!)
	
	
	public void method1() {
		
		// * 배열을 왜 쓰는지?
		
		/*
		 * 	변수라는 것만을 이용하게 되면 => 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리
		 * 	
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		*/
		
		//출력하고자 할 때도 => 일일이 출력해야됌
		/*System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		*/
		
		//for문으로 불가능
		
		// 총합계를 구할 때도 => 일일이 더해줘야됌 (반복문 활용 불가)
		
		/*
		 * 1. 배열 선언(여러개의 값을 보관할 배열을 만들겠다!!)
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명; => 이걸로
		 */
		
		//int a; // 변수 선언
		
		//int arr[];
		//int[] arr; // 오로지 int값만 담을 수 있다!!
		
		/*
		 * 2. 배열 할당(크기지정) => 이 배열의 몇개의 값을 보관할껀지 크기를 지정하는 과정 // 방만들기
		 *    배열명 = new 자료형[배열크기];
		 */
		
		//arr = new int[5];
		
		// *** 배열 선언과 동시에 할당 (배열 만듦과 동시에 크기 지정)
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입
		 * 	  배열명[인덱스] = 값;
		 */
		
		// 반복문으로 써보는 거 어떨까?
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 장점 : 반복문 활용 가능!!
		for (int i = 0 ; i <= 4 ; i++ ) {
			arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		
		for (int i = 0 ; i <= 4 ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 실제 arr이라는 박스에는 "주소값" 이라는게 담겨있음
	}
	
	public void method2() {
		
		int i = 10;
		
		// 배열 선언과 동시에 할당
		// iArr => 5 int형
		
		int[] iArr = new int[5];
		
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 리터럴 값을 곧바로 담을 수 있는 변수는 일반 변수라고 얘기하고
		 * 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 한다.
		 * 
		 * 기본자료형 (boolean, char, byte, short, int, long, float, double)으로 선언한 변수
		 * => 실제 리터럴값을 바로 담는 변수 => 일반변수
		 * 
		 * 그 외 자료형(String, int[], double[], char[], short[], ....) 으로 선언된 변수
		 * => 실제 리터럴값이 아닌 주소값을 담는 변수 => 참조변수
		 * 
		 */
	}
	
	public void method3() {
		int[] iArr = new int[3]; //0번~2번 인덱스
		double []dArr = new double[4]; //0번~3번 인덱스
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("==================");
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(dArr[i]);
		}
		// 내가 각 인덱스에 초기화를 하지 않아도 값들이 담겨있음! 왜?
		// Heap이라는 공간에 절대 빈공간이 존재할 수 없음!
		// 따라서 공간이 만들어질 때 JVM이 기본적으로 초기화(대입)을 진행해줌
	}
	
	public void method4() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 */
		
		// for 문으로 값 대입 + for문으로 값 출력
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // 배열의 자료형 + @ 주소값 16진수
		System.out.println((arr.hashCode())); // 주소값의 10진수 형태
		System.out.println("배열의 길이 : " + arr.length); // 배열의 길이 => 배열 크기 변경 요청
	}
	
	public void method5() {
		int result = 0; // arr 초기화 값
		
		// 배열 쓰면서 볼 수 있는 오류들
		//int[] arr; // 크기지정(할당)을 까먹은 경우
		
		int[] arr = null; // 아무것도 참조하고 있지 않음
		
		//System.out.println(arr); // 초기화 안돼있어서 오류남
		
		// null 가지고 메소드를 호출한다거나 특정 어딘가에 접근하자고 한다면 항상 오류가 발생!!
		// NullPointerException 오류
		//System.out.println(arr.hashCode());
		//System.out.println(arr.length);
		//System.out.println(arr[0]);
	}
	
	public void method6() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;		2 * 1
		 * arr[1] = 4;		2 * 2
		 * arr[2] = 6;		2 * 3
		 * arr[3] = 8;		2 * 4
		 * arr[4] = 10;		2 * 5
		 */
		
		
		/*
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = 2*(i+1);
		}
		*/
		
		int value = 2;
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = value;
			value+=2;
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드 값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		/*
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시시 발생(범위에서 벗어난 인덱스 제시)
		arr[5] = 12;
		arr[6] = 12;
		*/
		
		// * 배열의 가장 큰 단점
		// - 한번 지정된 배열의 크기는 변경이 불가
		// => 배열의 크기를 변경하고자 한다면 다시 만들어야됌
		
		arr = new int[7];
		System.out.println("변경 후의 arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("변경 후의 arr의 길이 : " + arr.length);
		// 주소값이 변경 됌!! => 새로운 곳 참조하고 있음!!
		
		/*
		 * 연결이 끊겨진 기존 배열은 Heap영역에 둥둥 떠다님(어디에도 참조되어있지 않음으로 필요없는 존재 = 지워주는게 좋다)
		 * => 일정시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌!!
		 * => 자바에서의 "자동 메모리 관리" 특징!! => 개발자가 코드작성에만 신경쓸 수 있음
		 */
		
		//배열을 강제로 삭제시키고자 한다면??
		
		//배열을 강제로 삭제시키고자 한다면?? => 연결고리를 끊으면 됨!!
		arr = null; // 아무것도 참조하지 않겠다!
		
		System.out.println(arr);
		
		// arr.length => NullPointerException 발생
		
	}
	
	public void method7() {
		// 배열 선언, 할당, 초기화 다 동시에 하기
		
		// 표현법1
		int[] arr1 = new int[] {1,2,3,4};
		
		// 표현법2
		int[] arr2 = {1,2,3,4};
		
		System.out.println(arr1[1] == arr2[1]); //false
		// 각각의 변수에 담겨있는 주소값을 비교하기 때문
	}
	
	public void method8() {
		// 1. 크기 10짜리 정수 배열 생성 => arr
		
		int[] arr = new int[10];
		
		// 2. 반복문 활용해서 0번인덱스~마지막인덱스까지 순차적으로 접근하면서 값을 대입(? 라는 값을 대입)
		//    매번 1~100 사이에 발생되는 랜덤값
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값 출력
		// arr[x] : xxx출력
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		// for (int i = 0 ; i < arr.length ; i++ ) !!!  <= 가 아님
		
	}
	
	public void method9() {
		//1. 사용자에게 배열의 길이를 입력 받은 후 해당 그 크기만큼의 문자열 배열 생성;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		sc.nextLine(); // 버퍼에 남아있는 엔터를 제거하기 위한 코드
		
		String[] arr = new String[size];
		
		//2. 반복문을 활용해서 매번 사용자에게 과일명 입력 받아 그 값을 매 인덱스자리에 대입
		// 좋아하는 과일 입력 : 
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.print("좋아하는 과일 입력 : ");
			//String str = sc.nextLine();
			//arr[i] = str;
			arr[i] = sc.nextLine();
		}
		
		//3. 반복문을 활용해서 0부터 마지막인덱스까지 담긴 값 출력
		// arr[1] = 바나나
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
	
	public void method10() {
		// 사용자에게 문자열 하나 입력받은후
		// 각각의 인덱스에 있는 문자들을 Char 배열에 옮겨담기
		
		// 1. 사용자에게 문자열 입력 받기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. char형 배열 생성해두기 => (이때 배열의 크기 == 문자열의 길이만큼)
		
		char[] arr = new char[str.length()];
		
		// 3. 반복문 활용해서 해당 문자열 에서 각 인덱스별 문자를 char배열의 각 인덱스에 대입
		// arr[0] = str.charAt(0);
		// arr[1] = str.charAt(1);
		// arr[2] = str.charAt(2);
		// arr[3] = str.charAt(3);
		// ...
		// arr[마지막] = str.charAt(마지막);
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = str.charAt(i);
		}
		
		// 4. 반복문 활용해서 해당 배열의 0~마지막 인덱스 까지 담긴 값 출력
		
		int count = 0;
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			
			if(arr[i] == ch) {
				count++;
			}
		}
		
		System.out.println("찾아진 문자 개수 : " + count);
		
	}
	
	public void method11() {
		// 1. 사용자에게 배열의 길이를 입력 받은 후 해당 크기만큼의 정수 배열 생성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 입력 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 2. 반복문 활용해서 0~마지막 인덱스까지 매번 1~100 사이의 랜덤값 발생시켜 대입
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문 활용해서 출력 + 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합 출력
		
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수 총합 : " + sum);
		
	}
	
	public void remind() {
		/*
		 * 변수만을 가지고 프로그래밍 했을 경우
		 */
		
		int age1 = 15;
		int age2 = 23;
		int age3 = 50;
		int age4 = 34;
		int age5 = 25;
		
		//System.out.println(age1);
		
		// 반복문 사용 불가
		for(int i=1; i<6; i++) {
			//System.out.println(agei); // agei라는 이름의 변수를 찾고있음
			//System.out.println(age + i); // age라는 이름의 변수를 찾고있음
		}
		
		//배열 가지고 프로그래밍
		int[] ages = new int[5];
		
		ages[0] = 15;
		ages[1] = 23;
		ages[2] = 50;
		ages[3] = 34;
		ages[4] = 25;
		
		// 인덱스 값 출력
		int sum = 0;
		for(int i = 0 ; i < ages.length ; i++ ) {
			System.out.println(ages[i]);
			// 누적합 공식
			sum += ages[i];
		}
		System.out.println("총 나이의 합 : " + sum);
		
		
	}
	
	
	
	
	

}
