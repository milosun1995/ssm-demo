package org.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.dao.BookDao;
import org.ssm.entity.Book;
import org.ssm.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao dao;

	

	@Override
	public Book queryById(long id) {
		
		return dao.queryById(id);
	}

	@Override
	public int save(Book book) {
		
		return dao.save(book);
	}

	@Override
	public int update(long id) {
		
		return dao.update(id);
	}

	@Override
	public List<Book> queryAll(int offset, int limit) {
		
		return dao.queryAll(offset, limit);
	}

	@Override
	public int delete(long id) {
		
		return dao.delete(id);
	}

}
