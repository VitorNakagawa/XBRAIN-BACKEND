package com.vitor.paymentsystem.repository;


import com.vitor.paymentsystem.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SalesRepository extends JpaRepository<Sales, Long> {
    
}

