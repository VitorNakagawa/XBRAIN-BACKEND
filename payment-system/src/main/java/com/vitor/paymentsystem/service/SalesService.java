package com.vitor.paymentsystem.service;

import com.vitor.paymentsystem.entity.Sales;
import com.vitor.paymentsystem.repository.SalesRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public Sales save( Sales sale ){
        return salesRepository.save(sale);
    }
 
}
