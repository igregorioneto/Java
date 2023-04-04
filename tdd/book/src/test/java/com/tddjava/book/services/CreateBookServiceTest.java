package com.tddjava.book.services;

import com.tddjava.book.modules.books.entities.Book;
import com.tddjava.book.modules.books.repositories.BookInMemoryRepository;
import com.tddjava.book.modules.books.services.CreateBookService;
import com.tddjava.book.modules.books.services.FindAllBookService;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateBookServiceTest {

    @Test
    public void should_be_able_to_create_a_new_book() {
//        Criar um Livro
//        Criar tabela do Livro
//        ID, Name, Author
          Book book = new Book();
          book.setId(UUID.randomUUID());
          book.setName("The Lord of the Rings");
          book.setAuthor("J. R. R. Tolkien");

          //        Repository
          BookInMemoryRepository repository = new BookInMemoryRepository();

          //        Service
          CreateBookService service = new CreateBookService(repository);
          Book createdBook = service.execute(book);

          assertNotNull(createdBook.getId());
    }

    @Test
    public void should_be_able_to_list_books() {
        BookInMemoryRepository repository = new BookInMemoryRepository();

        FindAllBookService service = new FindAllBookService(repository);
        List<Book> listBooks = service.execute();

        Assertions.assertThat(listBooks).isNotNull();
    }
}
