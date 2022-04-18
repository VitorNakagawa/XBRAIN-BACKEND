package com.vitor.paymentsystem.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sales")
@Entity
@EnableJpaRepositories
@EnableJpaAuditing

public class Sales  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sale_id;

    @Temporal(TemporalType.DATE)
    @Column(name = "saleDate")
    private Date saleDate;

    @Column(name = "value", nullable = false)
    private Float value;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    private Seller seller_id;

    // @ManyToOne
    // @JoinColumn(name = "seller_name", referencedColumnName = "name")
    // private Seller seller_name;

    @PrePersist
    private void onCreate() {
        saleDate = new Date();
    }

    
   
}