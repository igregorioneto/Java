package com.tddjava.book.modules.books.repositories;

import com.tddjava.book.modules.books.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookJPARepository extends JpaRepository<Book, UUID> {
    public Book findByName(String name);
}
