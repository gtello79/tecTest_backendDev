package com.example.tectestbackenddev.entitys;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private double productPrice;

    @Column(name="iso_code")
    private int isoCode;
}
