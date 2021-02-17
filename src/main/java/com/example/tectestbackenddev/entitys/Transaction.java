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
    @Column(name ="IdTransaction")
    private int idTransaction;

    @Column(name = "IDEmployer")
    private int idEmployer;

    @Column(name = "IDProduct")
    private int idProduct;

    @Column(name = "IDTransactionType")
    private int idTransactionType;

    @Column(name = "TransactionDate")
    private String transactionDate;

    @Column(name="TransactionTime")
    private String transactionTime;


}
