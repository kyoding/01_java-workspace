package com.kh.pr_classDiagram.run;

import com.kh.pr_classDiagram.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		//호출하기
		
		Product p = new Product();
		
		//세팅하기
		
		p.setpName("에어포스");
		p.setPrice(129000);
		p.setBrand("나이키");
		
		//출력해서 확인하기
		System.out.println(p.getpName());
		System.out.println(p.getPrice());
		System.out.println(p.getBrand());
		
		
	}

}
