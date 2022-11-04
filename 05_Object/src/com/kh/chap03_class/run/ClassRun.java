package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		// 셋팅시작
		
		p.setId("minkyo");
		p.setPwd("qwe123");
		p.setName("정민교");
		p.setAge(28);
		p.setGender('M');
		p.setPhone("010-7350-7926");
		p.setEmail("minkyo0816@gmail.com");
		
		System.out.println("아이디 : " + p.getId());
		System.out.println("비밀번호 : " + p.getPwd());
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("성별 : " + p.getGender());
		System.out.println("휴대폰번호 : " + p.getPhone());
		System.out.println("이메일 : " + p.getEmail());
		
		System.out.println();
		System.out.println("==================");
		System.out.println();
		
		Product p1 = new Product();
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		
		Product p2 = new Product();
		p2.setpName("아이폰");
		p2.setPrice(1300000);
		p2.setBrand("애플");
		
		// pName : xxx, price : xxxx, brand : xxxx
		
		System.out.println("pName : " + p1.getpName() + ", price : " + p1.getPrice() + ", brand : " + p1.getBrand());
		System.out.println("pName : " + p2.getpName() + ", price : " + p2.getPrice() + ", brand : " + p2.getBrand());
		
		System.out.println("=== 메소드 만들고 난 후 ===");
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		System.out.println("=== Person information ===");
		System.out.println(p.information());
		
		// ====== Person 생성자 =======
		
		System.out.println();
		System.out.println("========================");
		
		
		// 기본
		Person p3 = new Person();
		System.out.println(p3.information());
		
		// 이름 비번 나이 폰번호
		Person p4 = new Person("김땡땡", "123qwe", 20, "010-0000-0000");
		System.out.println(p4.information());
		
		// 전체
		Person p5 = new Person("user1", "123qwe", "김땡땡", 20, 'M', "010-0000-0000", "KDD@gmail.com" );
		System.out.println(p5.information());
		
	
		
	}

}
