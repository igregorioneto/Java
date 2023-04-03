package com.cleanarchiteture.book.book.data.repositories;

import com.cleanarchiteture.book.book.data.datasources.BookDatasourceLocal;
import com.cleanarchiteture.book.book.data.models.BookModel;
import com.cleanarchiteture.book.book.domain.entities.Book;
import com.cleanarchiteture.book.book.domain.repositories.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    final BookDatasourceLocal datasource;

    public BookRepositoryImpl(BookDatasourceLocal datasource) {
        this.datasource = datasource;
    }

    @Override
    public void createBook(Book book) {
        BookModel bookModel = new BookModel();
        datasource.createBook(bookModel);
    }

    @Override
    public void deleteBook(long id) {
        datasource.deleteBook(id);
    }

    @Override
    public Book getBook(long id) {
        BookModel bookModel = new BookModel();
        return bookModel.toBook(datasource.getBook(id));
    }

    @Override
    public List<Book> getBooks() {
        BookModel bookModel = new BookModel();
        return bookModel.toBookList(datasource.getBooks());
    }
}
