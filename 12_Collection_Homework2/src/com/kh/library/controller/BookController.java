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
		boolean find = true; // flag변수 : 깃발, 지표..
		for(Book b:bList) { // b=bList.get(0)
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명" + nBook.getTitle() + "도서는 이미 소장하고있는 책입니다.");
				find = false; //중복됐다
				break;
			}
		}
		// 중복이 된경우 => find : false
		if(find == true) { // 중복이 안됐다
			bList.add(nBook);
			System.out.println("도서명"+nBook.getTitle() + "도서가 성공적으로 추가됐습니다.");
		}
		
		bList.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {

		Book search = new Book();
		
		for (Book b : bList) { // b = bList.get(0)
			if(b.getbNo().equals(bNo)) {
				// 핵심!!
				search = b; // 객체 자체를 넣는거
			}
		}
		
		return search;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(Book b : bList) {
			if(b.getTitle().contains(title)) {
				searchList.add(b);
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		for(Book b : bList) {
			//instance of
			
			if(b instanceof Book) {
				bookList.add(b);
			}
			
			/*
			if(b instanceof Magazine) {
				continue; // 조건문 탈출함수
			}else {
				bookList.add(b);
			}
			*/
		}
		
		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> magazineList = new ArrayList<Book>();
		for(Book b : bList) {
			if(b instanceof Magazine) {
				magazineList.add(b);
			}
		}
		
		
		return magazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> mList = new ArrayList<Book>();
		
		for (Book b : bList) {
			if (((Magazine)b).getYear() == year) {
				mList.add(b);
			}
		}
		return mList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> pubList = new ArrayList<Book>();
		
		for (Book b : bList) {
			if (b.getPublisher().contains(publisher)) {
				pubList.add(b);
			}
		}
		
		return pubList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> pList = new ArrayList<Book>();
		
		for (Book b : bList) {
			if (b.getPrice() <= price) {
				pList.add(b);
			}
		}
		
		return pList;
	}

	@Override
	public int getTotalPrice() {
		
		int total = 0;
		for(Book b : bList) {
			total += b.getPrice();
		}
		
		return total;
	}

	@Override
	public int getAvgPrice() {
		
		int total = 0;
		int avg = 0;
		
		for(Book b : bList) {
			total += b.getPrice();
		}
		avg = total/bList.size();
		
		return avg;
	}
	
	
}