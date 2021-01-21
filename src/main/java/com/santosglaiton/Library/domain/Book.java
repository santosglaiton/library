package com.santosglaiton.Library.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Book implements Serializable {

    @Id
    Integer id_book;
    String book_name;
    Boolean available;

    public Book() {
    }

    public Book(Integer id_book, String book_name, Boolean available) {
        this.id_book = id_book;
        this.book_name = book_name;
        this.available = available;
    }

    public Integer getId_book() {
        return id_book;
    }

    public void setId_book(Integer id_book) {
        this.id_book = id_book;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id_book.equals(book.id_book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_book);
    }
}
