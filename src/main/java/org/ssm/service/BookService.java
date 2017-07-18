package org.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ssm.entity.Book;

public interface BookService {

	
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	Book queryById(long id); 
	
	int  save(Book book);
	
	int  update(long id);
	
	int delete(long id);
}
