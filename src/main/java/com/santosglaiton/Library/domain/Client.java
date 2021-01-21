package com.santosglaiton.Library.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    Integer id_Client;
    String name_Client;

    public Client() {
    }

    public Client(Integer id_Client, String name_Client) {
        this.id_Client = id_Client;
        this.name_Client = name_Client;
    }

    public Integer getId_Client() {
        return id_Client;
    }

    public void setId_Client(Integer id_Client) {
        this.id_Client = id_Client;
    }

    public String getName_Client() {
        return name_Client;
    }

    public void setName_Client(String name_Client) {
        this.name_Client = name_Client;
    }
}
