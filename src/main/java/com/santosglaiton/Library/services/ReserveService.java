package com.santosglaiton.Library.services;

import com.santosglaiton.Library.domain.Reserve;
import com.santosglaiton.Library.repositories.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;

    public Reserve makeReservation(Reserve obj) {
        obj.setId_reserve(null);
        obj.getBook().getId_book();
        obj.getClient().getId_Client();
        obj.getBegin();

        return null;
    }
}
