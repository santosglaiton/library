package com.santosglaiton.Library.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reserve {

    @Id
    Integer id_reserve;
    @ManyToOne
    @JoinColumn(name = "book_reserve_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "client_reserve_id")
    private Client client;
    Date begin;
    Date end;

    public Reserve() {
    }

    public Reserve(Integer id_reserve, Book book, Client client, Date begin, Date end) {
        this.id_reserve = id_reserve;
        this.book = book;
        this.client = client;
        this.begin = begin;
        this.end = end;
    }

    public Integer getId_reserve() {
        return id_reserve;
    }

    public void setId_reserve(Integer id_reserve) {
        this.id_reserve = id_reserve;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
