package com.example.tectestbackenddev.entities;

import javax.persistence.*;

import lombok.*;

import java.sql.Time;
import java.util.Date;

@Setter
@Getter
@ToString

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @Column(name = "transactionId")
    private int transactionId;

    @Column(name = "transactionDate")
    private Date transactionDate;

    @Column(name="transactionTime")
    private Time transactionTime;

    @Column(name="transactionType")
    private int transactionType;

    @OneToOne
    @JoinColumn(name="employerId")
    private Employer employer;

    @OneToOne
    @JoinColumn(name="productId")
    private Product product;

}
