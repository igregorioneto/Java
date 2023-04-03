package com.cleanarchiteture.book.book.domain.usecases;

import com.cleanarchiteture.book.book.domain.entities.Book;
import com.cleanarchiteture.book.book.domain.repositories.BookRepository;

public class GetBook {
    final BookRepository repository;

    public GetBook(BookRepository repository) {
        this.repository = repository;
    }

    Book call(long id) {
        return repository.getBook(id);
    }
}
