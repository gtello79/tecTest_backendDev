package com.example.tectestbackenddev.entitys;

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
    @Column(name ="transaction_id")
    private int transactionId;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "product_id")
    private int ProductId;

    @Column(name = "transaction_type_id")
    private int transactionTypeId;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name="transaction_time")
    private Time transactionTime;

}
