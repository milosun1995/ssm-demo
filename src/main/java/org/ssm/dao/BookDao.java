package org.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ssm.entity.Book;

public interface BookDao {
		
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	Book queryById(Long id); 
	
	int  save(Book book);
	
	int update(Long id); 
	
	int delete(long id);
}
