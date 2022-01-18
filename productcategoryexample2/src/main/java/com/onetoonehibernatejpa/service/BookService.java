package com.onetoonehibernatejpa.service;

import org.springframework.stereotype.Component;
import com.onetoonehibernatejpa.entity.Book;

@Component
public interface BookService
{
	public Book saveBook(Book book);
    public Book findByBookId(int bookId);

}
