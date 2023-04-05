package org.quarkus.api.services;

import org.quarkus.api.models.Book;
import org.quarkus.api.repositories.BookRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class BookService {

    @Inject
    private BookRepository repository;

    public Book created(Book book) {
        return repository.save(book);
    }

    public Book updated(Book book) {
        Book bookUpdated = Book.findById(book.id);
        bookUpdated.setName(book.getName());
        bookUpdated.setAuthor(book.getAuthor());
        return repository.save(bookUpdated);
    }

    public Optional<Book> find(Long id) {
        return repository.find(id);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
