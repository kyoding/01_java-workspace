package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.model.vo.Child1;
import com.kh.chap01_poly.model.vo.Parent;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 개념을 적용했을때 !!!
public class ElectronicShop2 {
	// 용산 전자상가에 있는 가게
	// 3개 취급하는 가게
	// 창고만들기
	
	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식객체를 담을 수 있음!!
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	// Parent[] arr = new Parent[4];
	// arr[0] = new Child1(1, 2, 4); // 객체1
	// 이런식으로 진행
	
	Electronic[] elec = new Electronic[3]; // 이게 곧 창고
	
	int count = 0;
	
	// insert 함수구현
	// 매개변수 => Desktop. NoteBook, Tablet 전부 다 받을 수 있는부모 Electronic 으로 생성
	
	// 부모타입 배열로 모든 자식 객체를 다루기
	public void insert(Electronic any) {
		elec[count++] = any;
		//elec[0] = Desktop => 끝나고 count : 1 이됌
		//elec[1] = NoteBook => 끝나고 count : 2 가됌
		//elec[2] = Tablet => 끝나고 count : 3 이됌
	}
	
	//모르면 우선 void로 짜자 => 나중에 수정 가능
	public Electronic select(int index) {
		return elec[index];
	}
	
}
