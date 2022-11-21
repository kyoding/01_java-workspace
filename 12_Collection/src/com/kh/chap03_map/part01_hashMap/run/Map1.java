package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고 싶은 단어는? : ");
			String word = sc.nextLine();
			
			if(word.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
			String kor = dic.get(word); // vavy
			if(kor == null) {
				System.out.println(word + "는 없는 단어 입니다.");
			} else {
				System.out.println(kor);
			}
		}
	}
	
	//	Person이라는 vo를 만들어서 이름 / 전화번호로 vo만들기
	//  ㅇㅇㅇ 01011112222
	//  ㅁㅁㅁ 01022223333
	//  전화번호부 만들기 이름치면 전화번호 나오게 => 이름 없으면 추가 기능도
	//  전화번호부를 file로 입출력하는거까지 한번 해보기!!

}
