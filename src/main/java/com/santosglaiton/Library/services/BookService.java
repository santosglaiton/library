package com.santosglaiton.Library.services;

import com.santosglaiton.Library.domain.Book;
import com.santosglaiton.Library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

}
