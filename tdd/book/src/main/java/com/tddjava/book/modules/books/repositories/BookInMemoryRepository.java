package com.tddjava.book.modules.books.repositories;

import com.tddjava.book.modules.books.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BookInMemoryRepository implements IBookRepository {
    private List<Book> books;

    public BookInMemoryRepository() {
        this.books = new ArrayList<>();
    }

    @Override
    public Book findByName(String name) {
        Optional<Book> optional = this.books.stream().filter(book -> book.getName().equals(name)).findFirst();
        return optional.orElse(null);
    }

    @Override
    public Book save(Book book) {
        this.books.add(book);
        book.setId(UUID.randomUUID());
        return book;
    }

    @Override
    public List<Book> findAll() {
        return this.books;
    }
}
