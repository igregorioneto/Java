package com.cleanarchiteture.book.book.data.datasources;

import com.cleanarchiteture.book.book.data.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBookRepository extends JpaRepository<BookModel,Long> {
}
