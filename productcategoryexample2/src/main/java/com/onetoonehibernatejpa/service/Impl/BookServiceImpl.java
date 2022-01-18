package com.onetoonehibernatejpa.service.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onetoonehibernatejpa.entity.Book;
import com.onetoonehibernatejpa.entity.Story;
import com.onetoonehibernatejpa.repository.BookRepository;
import com.onetoonehibernatejpa.service.BookService;

@Service
public class BookServiceImpl implements BookService
{
	@Autowired
    private BookRepository bookRepository;
    public Book saveBook(Book book)
    {
        List<Story> storyList = new ArrayList<>();
        
        Story story1 = new Story();
        story1.setStoryName("Arrays");
        
        Story story2 = new Story();
        story2.setStoryName("Pointers");
     
        Story story3 = new Story();
        story3.setStoryName("Loops");
    
        storyList.add(story1);
        storyList.add(story2);
        storyList.add(story3);
       
        story1.setBook(book);
        story2.setBook(book);
        story3.setBook(book);
        book.setStoryList(storyList);
        book = bookRepository.save(book);
        return book;
    }
    public Book findByBookId(int bookId) 
    {
        Book book = bookRepository.findByBookId(bookId);
        return book;
    }

}
