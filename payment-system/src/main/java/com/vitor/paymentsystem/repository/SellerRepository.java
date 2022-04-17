package com.vitor.paymentsystem.repository;

import com.vitor.paymentsystem.entity.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
