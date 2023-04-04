package com.tddjava.book.modules.books.services;

import com.tddjava.book.modules.books.entities.Book;
import com.tddjava.book.modules.books.repositories.IBookRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateBookService {
    private IBookRepository repository;

    public CreateBookService(IBookRepository repository) {
        this.repository = repository;
    }

    public Book execute(Book book) {
        Book existedBook = this.repository.findByName(book.getName());

        if (existedBook != null)
            throw new Error("Book existed");

        return this.repository.save(book);
    }
}
