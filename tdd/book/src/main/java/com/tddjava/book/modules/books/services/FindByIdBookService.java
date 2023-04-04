package com.tddjava.book.modules.books.services;

import com.tddjava.book.modules.books.entities.Book;
import com.tddjava.book.modules.books.repositories.IBookRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FindByIdBookService {
    private IBookRepository repository;

    public FindByIdBookService(IBookRepository repository) {
        this.repository = repository;
    }

    public Book execute(UUID id) {
        return this.repository.findById(id);
    }
}
