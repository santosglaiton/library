package com.santosglaiton.Library.repositories;

import com.santosglaiton.Library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    public List<Book> findByAvailableFalse();

}
