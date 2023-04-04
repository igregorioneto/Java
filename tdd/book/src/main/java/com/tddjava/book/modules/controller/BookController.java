package com.tddjava.book.modules.controller;

import com.tddjava.book.modules.books.entities.Book;
import com.tddjava.book.modules.books.repositories.BookRepository;
import com.tddjava.book.modules.books.services.CreateBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository repository;

    @PostMapping("/")
    public Book createBook(@RequestBody Book book) {
        CreateBookService service = new CreateBookService(repository);
        return service.execute(book);
    }
}
