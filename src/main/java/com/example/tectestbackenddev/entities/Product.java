package com.example.tectestbackenddev.entities;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString


@Entity
@Table(name = "product")
public class Product
{

    @Id
    @Column(name = "idproduct")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @Column(name="productname")
    private String productName;

    @Column(name="productprice")
    private double productPrice;

    @Column(name="isocode")
    private int isoCode;

}
