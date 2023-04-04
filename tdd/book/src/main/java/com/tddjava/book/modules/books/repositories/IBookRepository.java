package com.tddjava.book.modules.books.repositories;

import com.tddjava.book.modules.books.entities.Book;

import java.util.List;
import java.util.UUID;

public interface IBookRepository {
    public Book findByName(String name);

    public Book save(Book book);

    public List<Book> findAll();

    public Book findById(UUID id);
}
