package com.cleanarchiteture.book.book.data.models;

import com.cleanarchiteture.book.book.domain.entities.Book;

public class BookRequestModel {
    private Long id;
    private String title;

    public static Book toBook(BookRequestModel bookRequest) {
        Book book = new Book();
        book.setId(bookRequest.getId());
        book.setTitle(bookRequest.getTitle());
        return book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "BookRequestModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
