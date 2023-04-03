package com.cleanarchiteture.book.book.data.models;

import com.cleanarchiteture.book.book.domain.entities.Book;

public class BookResponseModel {
    int code;
    String message;

    public BookResponseModel() {}

    public BookResponseModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
