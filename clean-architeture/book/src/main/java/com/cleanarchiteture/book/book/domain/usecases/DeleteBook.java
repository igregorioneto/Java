package com.cleanarchiteture.book.book.domain.usecases;

import com.cleanarchiteture.book.book.domain.repositories.BookRepository;

public class DeleteBook {
    final BookRepository repository;

    public DeleteBook(BookRepository repository) {
        this.repository = repository;
    }

    void call(long id) {
        repository.deleteBook(id);
    }
}
