package com.vitor.paymentsystem.service;

import java.util.List;

import com.vitor.paymentsystem.entity.Seller;
import com.vitor.paymentsystem.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Seller save( Seller seller ){
        return sellerRepository.save(seller);
    }

    public List<Seller> listAllSellers(){
        return sellerRepository.findAll();
    }
    
}
