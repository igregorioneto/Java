package com.cleanarchiteture.book.book.data.datasources;

import com.cleanarchiteture.book.book.data.models.BookModel;

import java.util.List;

public interface BookDatasourceLocal {
    public void createBook(BookModel book);
    public void deleteBook(long id);
    public BookModel getBook(long id);
    public List<BookModel> getBooks();
}
