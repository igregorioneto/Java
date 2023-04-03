package com.cleanarchiteture.book.book.data.datasources.impl;

import com.cleanarchiteture.book.book.data.datasources.BookDatasourceLocal;
import com.cleanarchiteture.book.book.data.datasources.JpaBookRepository;
import com.cleanarchiteture.book.book.data.models.BookModel;

import java.util.List;
import java.util.Optional;

public class BookDatasourceLocalImpl implements BookDatasourceLocal {

    final JpaBookRepository repository;

    public BookDatasourceLocalImpl(JpaBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createBook(BookModel book) {
        repository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        repository.deleteById(id);
    }

    @Override
    public BookModel getBook(long id) {
        Optional<BookModel> op = repository.findById(id);
        return op.get();
    }

    @Override
    public List<BookModel> getBooks() {
        return repository.findAll();
    }
}
