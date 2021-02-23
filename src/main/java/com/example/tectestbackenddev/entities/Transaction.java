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
    @Column(name = "transactionid")
    private int transactionId;

    @Column(name = "transactiondate")
    private Date transactionDate;

    @Column(name="transactiontime")
    private Time transactionTime;

    @Column(name="transactiontype")
    private int transactionType;

    @ManyToOne
    @JoinColumn(name="employerId")
    //@Column(name = "employerid")
    @ToString.Exclude
    private Employer employer;

    @ManyToOne
    @JoinColumn(name="productid" )
    //@Column(name = "productid")
    @ToString.Exclude
    private Product product;

}
