package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성을 적용 안했을때!!
public class ElectronicShop1 {
	
	//용산 전자상가에 있는 가게
	//3개제품을 마련할 자리부터 만들자
	
	//model.vo => Desktop, NoteBook, Tablet, User
	//controller => **기능 수행** insert, select, selectUserPwd
	//run => 프로그램 실행 => controller 만들어놨던 메소드(함수)를 호출
	
	private Desktop desk; // 데탑을 만들어서 보관할 창고
	private NoteBook note; // 노트북을 만들어서 보관할 창고
	private Tablet tab; // 태블릿을 만들어서 보관할 창고
	
	// 객체생성은 안되고 텅 비어있음
	// 이건 실제로 객체 생성된것은 아님
	
	// 필드가 메모리상에 확보되는 순간 => 객체 가생성되는 순간임
	
	// 반환형 모르면 일단은 void로 가자!!
	// Desktop 객체를 받아줄수 있게 매개변수 작성
	// 매개변수 : 자료형 + 이름
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~)
		desk = d;
	}
	
	//NoteBook 객체를 받으줄 수 있게 매개변수 작성
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~)
		note = n;
	}
	
	//Tablet 객체를 받으줄 수 있게 매개변수 작성
	public void insert(Tablet t) { // Tablet t = new Tablet(~~~)
		tab = t;
	}
	
	// 조회
	// 모르겠으면 일단은 반환형을 void로 가자!!
	public Desktop selectDesktop() {
		return desk; 
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}
	

