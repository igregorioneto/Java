package com.cleanarchiteture.book.book.data.controllers;

import com.cleanarchiteture.book.book.data.models.BookRequestModel;
import com.cleanarchiteture.book.book.data.models.BookResponseModel;
import com.cleanarchiteture.book.book.domain.usecases.CreateBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCreateController {
    final CreateBook createBook;

    public BookCreateController(CreateBook createBook) {
        this.createBook = createBook;
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookResponseModel> create(@RequestBody BookRequestModel request) {
        try {
            createBook.call(BookRequestModel.toBook(request));
            return new ResponseEntity<BookResponseModel>(
                    new BookResponseModel(HttpStatus.OK.value(), HttpStatus.OK.name()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
