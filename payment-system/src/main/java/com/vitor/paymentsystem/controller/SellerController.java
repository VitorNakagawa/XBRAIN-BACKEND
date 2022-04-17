package com.vitor.paymentsystem.controller;

import java.util.List;

import com.vitor.paymentsystem.entity.Seller;
import com.vitor.paymentsystem.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Seller save(@RequestBody Seller seller) {
        return sellerService.save(seller);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Seller> listAllSellers() {
        return sellerService.listAllSellers();
    }

}
