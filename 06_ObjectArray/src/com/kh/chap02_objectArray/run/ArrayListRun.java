package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<Phone>(); // 뒤에는 생략가능 jdk 6이상부터는
		
		list.add(new Phone());
		list.add(new Phone("아이폰", "애플", 1300000, "11Pro"));
		list.add(new Phone("갤럭시", "삼성", 1200000, "s20"));
		
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		int total = 0;
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
		}
		
		System.out.println(list);
		
		System.out.println("총가격 : " + total);
		System.out.println("평균가 : " + total/list.size());
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력을 받아
		// 해당 휴대폰을 찾은 후에 그 가격을 알려주자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 휴대폰 입력 : ");
		String buy = sc.nextLine();
		
		/*
		for(int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 : " + list.get(i).getPrice());
			}
		}
		*/
		
		for (Phone p : list) {
			if(p.getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + p.getPrice() + "원 입니다.");
			}
		}
		

	}

}
