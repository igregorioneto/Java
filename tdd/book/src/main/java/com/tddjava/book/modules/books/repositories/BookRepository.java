package com.tddjava.book.modules.books.repositories;

import com.tddjava.book.modules.books.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookRepository implements IBookRepository {
    @Autowired
    BookJPARepository repository;

    @Override
    public Book findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public Book save(Book book) {
        return this.repository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Book findById(UUID id) {
        Optional<Book> optional = this.repository.findById(id).stream().findFirst();
        return optional.orElse(null);
    }
}
