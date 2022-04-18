package com.vitor.paymentsystem.repository;

import java.util.List;

import com.vitor.paymentsystem.entity.Seller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query(value = "SELECT seller.*, count(sales.seller_id) as totalSales from seller left join sales on (seller.seller_id = sales.seller_id) group by seller.seller_id", nativeQuery = true)
    List<Seller> findSellers();

}
