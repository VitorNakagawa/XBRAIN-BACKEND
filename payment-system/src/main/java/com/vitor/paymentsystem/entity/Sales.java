package com.vitor.paymentsystem.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Sales implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column( name="saleDate", nullable = false)
    private Date saleDate;

    @Column(name= "value", nullable=false)
    private Float value;

    @ManyToOne
    @JoinColumn(name="sellerID", referencedColumnName = "id")
    private Seller sellerID;

    @ManyToOne
    @JoinColumn(name="sellerName", referencedColumnName = "name")
    private Seller sellerName;


    @PrePersist
    private void onCreate() {
    saleDate = new Date();
}




}
