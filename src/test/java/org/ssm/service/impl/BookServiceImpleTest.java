package org.ssm.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.ssm.baseService.BaseTest;
import org.ssm.entity.Book;
import org.ssm.service.BookService;

public class BookServiceImpleTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testQueryAll() {
		List<Book> list = bookService.queryAll(0,5);
		for (Book book : list) {
			System.out.println(book);
		}
	}
	
	@Test
	public void testQueryById(){
		Book book=bookService.queryById(1000);
		System.out.println(book);
	}
	
	@Test
	public void testUpdate(){
		int flag=bookService.update(1000);
		if(flag>0){
			Book book=bookService.queryById(1000);
		System.out.println("成功更新 --》"+flag+"笔数据！");
		System.out.println(book);
		}
	}
	
	@Test
	public void testSave(){
		Book book=bookService.queryById(1006);
		if(book!=null){
			bookService.delete(book.getBookId());
		}
		Book b=new Book();
		b.setBookId(1006);
		b.setName("Linux 运维大全");
		b.setNumber(12);
		
		long flag=bookService.save(b);
		if(flag>0){
			System.out.println("成功新增"+flag+"笔数据");
			System.out.println(b);
		}
		
	}
}
