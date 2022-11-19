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
		Book search = new Book();
		for (Book b : bList) {
			if(b.getbNo().equals(bNo)) {
				search = b;
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> titleSearch = new ArrayList<Book>();
		for(Book b : bList) {
			if(b.getTitle().contains(title)) {
				titleSearch.add(b);
			}
		}
		return titleSearch;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> onlybSearch = new ArrayList<Book>();
		for(Book b : bList) {
			if(b instanceof Book) {
				onlybSearch.add(b);
			}
		}
		return onlybSearch;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> onlymSearch = new ArrayList<Book>();
		for(Book b : bList) {
			if(b instanceof Magazine) {
				onlymSearch.add(b);
			}
		}
		return onlymSearch;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> magazineSearch = new ArrayList<Book>();
		for(Book b : bList) {
			if(((Magazine)b).getYear() == year) {
				magazineSearch.add(b);
			}
		}
		return magazineSearch;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> pubSearch = new ArrayList<Book>();
		for(Book b : bList) {
			if(b.getPublisher() == publisher) {
				pubSearch.add(b);
			}
		}
		return pubSearch;
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
	
