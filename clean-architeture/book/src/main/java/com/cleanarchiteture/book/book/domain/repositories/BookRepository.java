package com.cleanarchiteture.book.book.domain.repositories;

import com.cleanarchiteture.book.book.domain.entities.Book;

import java.util.List;

public interface BookRepository {
    public void createBook(Book book);
    public void deleteBook(long id);
    public Book getBook(long id);
    public List<Book> getBooks();
}
