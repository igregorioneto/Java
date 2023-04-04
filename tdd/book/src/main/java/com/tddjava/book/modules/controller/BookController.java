package com.tddjava.book.modules.controller;

import com.tddjava.book.modules.books.entities.Book;
import com.tddjava.book.modules.books.repositories.BookRepository;
import com.tddjava.book.modules.books.services.CreateBookService;
import com.tddjava.book.modules.books.services.FindAllBookService;
import com.tddjava.book.modules.books.services.FindByIdBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/")
    public List<Book> findAllBooks() {
        FindAllBookService service = new FindAllBookService(repository);
        return service.execute();
    }

    @GetMapping("/id")
    public Book findByIdBook(@RequestParam("id") UUID id) {
        FindByIdBookService service = new FindByIdBookService(repository);
        return service.execute(id);
    }
}
