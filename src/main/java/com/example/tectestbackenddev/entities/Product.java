package com.example.tectestbackenddev.entities;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "idProduct")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @Column(name="productName")
    private String productName;

    @Column(name="productPrice")
    private double productPrice;

    @Column(name="isoCode")
    private int isoCode;

}
