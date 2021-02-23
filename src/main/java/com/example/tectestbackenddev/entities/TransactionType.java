package com.example.tectestbackenddev.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class TransactionType {

    @Id
    @Column(name="idTransaction")
    private int idTransaction;

    @Column(name="TransactionName")
    private String transactionName;

}
