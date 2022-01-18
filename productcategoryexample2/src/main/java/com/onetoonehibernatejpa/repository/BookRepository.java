package com.onetoonehibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onetoonehibernatejpa.entity.Book;

public interface BookRepository extends JpaRepository<Book, String>
{
    public Book findByBookId(int bookId);
 

}
