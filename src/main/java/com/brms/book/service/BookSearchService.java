package com.brms.book.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;

public class BookSearchService {

	/**
	 * 책을 검색하는 서비스*/
	@Autowired
	private BookDao bookDao;
	
	public BookSearchService() { }
	
	public Book searchBook(String bNum) {
		Book book = bookDao.select(bNum);
		return book;
	}

	// Bean이 생성될 때 호출
	public void initMethod(){
		System.out.println("BookSearchService Bean 생성");
	}

	// Bean이 소멸될 때 호출
	public void destroyMethod(){
		System.out.println("BookSearchService Bean 소멸");
	}
}
