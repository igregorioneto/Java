package com.cleanarchiteture.book.book.domain.usecases;

import com.cleanarchiteture.book.book.domain.entities.Book;
import com.cleanarchiteture.book.book.domain.repositories.BookRepository;

public class CreateBook {
    final BookRepository repository;

    public CreateBook(BookRepository repository) {
        this.repository = repository;
    }

    public void call(Book book) {
        repository.createBook(book);
    }
}
