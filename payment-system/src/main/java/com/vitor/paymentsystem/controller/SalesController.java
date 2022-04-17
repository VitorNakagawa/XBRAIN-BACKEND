package com.vitor.paymentsystem.controller;

import com.vitor.paymentsystem.entity.Sales;
import com.vitor.paymentsystem.service.SalesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaAuditing
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Sales save(@RequestBody Sales sale) {
        return salesService.save(sale);
    }

}
