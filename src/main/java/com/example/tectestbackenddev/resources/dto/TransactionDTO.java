package com.example.tectestbackenddev.resources.dto;

import com.example.tectestbackenddev.entities.Employer;
import com.example.tectestbackenddev.entities.Transaction;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TransactionDTO {

    private int transactionId;

    private int idEmployer;

    private int isoCodeProduct;

    private int typeTransaction;

    private String transactionDate;

    private String transactionTime;

    public TransactionDTO(Transaction transaction){
        this.idEmployer = transaction.getEmployer().getEmployerId();

        this.isoCodeProduct = transaction.getProduct().getIsoCode();

        this.typeTransaction = transaction.getTransactionId();

        this.transactionDate = transaction.getTransactionDate().toString();

        this.transactionTime = transaction.getTransactionTime().toString();
    }

}
