package com.kh.library.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager  {
	private ArrayList<Book> bList = new ArrayList<Book>();
	
	
	

	@Override
	public void addBook(Book nBook) {
		boolean find = true;
		for(Book b : bList) {
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + "도서는 이미 소장하고 있는 책입니다.");
				find = false;
				break;
			}
		}
			if(find == true) {
			bList.add(nBook);
			System.out.println("도서명 : " + nBook.getTitle() + "도서가 성공적으로 추가되었습니다.");
		}
	}
		

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		//return for(Book b : bList) {
			
		}
		
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		return null;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}
}
	
