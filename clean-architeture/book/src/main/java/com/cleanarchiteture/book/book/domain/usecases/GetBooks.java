package com.cleanarchiteture.book.book.domain.usecases;

import com.cleanarchiteture.book.book.domain.entities.Book;
import com.cleanarchiteture.book.book.domain.repositories.BookRepository;

import java.util.List;

public class GetBooks {
    final BookRepository repository;

    public GetBooks(BookRepository repository) {
        this.repository = repository;
    }

    List<Book> call() {
        return repository.getBooks();
    }
}
