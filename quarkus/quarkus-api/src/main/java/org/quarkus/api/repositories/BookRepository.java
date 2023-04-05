package org.quarkus.api.repositories;

import org.quarkus.api.models.Book;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class BookRepository {
    public Book save(Book book) {
        book.persist();
        return book;
    }

    public Optional<Book> find(Long id) {
        return Book.findByIdOptional(id);
    }

    public void delete(Long id) {
        this.find(id).ifPresent(Book::delete);
    }
}
