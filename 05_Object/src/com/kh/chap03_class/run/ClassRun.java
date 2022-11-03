package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

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
	}

}
