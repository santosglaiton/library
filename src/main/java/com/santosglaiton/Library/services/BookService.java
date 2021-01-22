package com.santosglaiton.Library.services;

import com.santosglaiton.Library.domain.Book;
import com.santosglaiton.Library.repositories.BookRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    public Book makeReservation(Integer id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()){
            Book book = bookOptional.get();
            book.setAvailable(Boolean.FALSE);
            return bookRepository.save(book);
        } else {
            throw new ObjectNotFoundException(id, "Book not found");
        }
    }

}
