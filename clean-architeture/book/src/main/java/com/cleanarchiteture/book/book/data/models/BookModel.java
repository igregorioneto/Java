package com.cleanarchiteture.book.book.data.models;

import com.cleanarchiteture.book.book.domain.entities.Book;
import jakarta.persistence.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "book")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;

    public BookModel(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    public BookModel() {}

    public Book toBook(BookModel bookModel) {
        Book book = new Book();
        book.setId(bookModel.getId());
        book.setTitle(bookModel.getTitle());
        return book;
    }

    public BookModel toBookModel(Book book) {
        BookModel bookModel = new BookModel();
        bookModel.setId(bookModel.getId());
        bookModel.setTitle(bookModel.getTitle());
        return bookModel;
    }

    public List<Book> toBookList(List<BookModel> bookModel) {
        return bookModel.stream().map(temp -> {
            Book obj = new Book();
            obj.setId(temp.getId());
            obj.setTitle(temp.getTitle());
            return obj;
        }).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
