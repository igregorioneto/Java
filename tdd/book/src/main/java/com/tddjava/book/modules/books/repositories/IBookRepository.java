package com.tddjava.book.modules.books.repositories;

import com.tddjava.book.modules.books.entities.Book;

public interface IBookRepository {
    public Book findByName(String name);

    public Book save(Book book);
}
