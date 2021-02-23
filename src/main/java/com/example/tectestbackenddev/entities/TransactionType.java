package com.example.tectestbackenddev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactionType")
public class TransactionType {

    @Id
    @Column(name="idtransaction")
    private int idTransaction;

    @Column(name="transactionname")
    private String transactionName;

}
