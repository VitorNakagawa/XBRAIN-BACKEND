package com.vitor.paymentsystem.service;

import com.vitor.paymentsystem.entity.Sales;
import com.vitor.paymentsystem.entity.Seller;
import com.vitor.paymentsystem.repository.SalesRepository;
// import com.vitor.paymentsystem.repository.SellerRepository;
import com.vitor.paymentsystem.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    @Autowired
    private SellerRepository sellerRepository;

    
    public Sales save( Sales sale, Long seller_id ){ 
         Seller seller = sellerRepository.getById(seller_id);
         sale.setSeller_id(seller);
         
        return salesRepository.save(sale);
    }
 
}
