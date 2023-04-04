package com.tddjava.book.modules.books.services;

import com.tddjava.book.modules.books.entities.Book;
import com.tddjava.book.modules.books.repositories.IBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllBookService {
    private IBookRepository repository;

    public FindAllBookService(IBookRepository repository) {
        this.repository = repository;
    }

    public List<Book> execute() {
        return this.repository.findAll();
    }
}
