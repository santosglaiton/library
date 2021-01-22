package com.santosglaiton.Library.controller;

import com.santosglaiton.Library.domain.Book;
import com.santosglaiton.Library.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> allBooks = bookService.getAll();
        return ResponseEntity.ok(allBooks);
    }

    @PostMapping("/books/{id}/reserve")
    public ResponseEntity<?> makeReserve(@PathVariable Integer id){
        bookService.makeReservation(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
