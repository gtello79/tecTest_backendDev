package com.example.tectestbackenddev.entitys;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @Column(name = "IDEmployer")
    private int idEmployer;

    @Column(name = "IDProduct")
    private int idProduct;

    @Column(name = "IDTransactionType")
    private int idTransaction;

    @Column(name = "TransactionDate")
    private String date;


}
