package com.example.tectestbackenddev.entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
public class Customer {

    private int customerId;
    private String customerName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;
    private String email;

    public Customer() {
        super();
    }

    public Customer(int customerId, String customerName, String email, LocalDate dateOfBirth) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }


}