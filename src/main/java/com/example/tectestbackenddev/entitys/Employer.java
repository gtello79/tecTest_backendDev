package com.example.tectestbackenddev.entitys;

import javax.persistence.*;

import lombok.*;

import java.util.ArrayList;

@Setter
@Getter
@ToString

@Entity
@Table(name = "Employer")
public class Employer {
    @Id
    @Column(name = "employer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employerId;

    @Column(name = "employerName")
    private String employerName;

    @Column(name = "employerPass")
    private String employerPass;

    @Column(name= "employer_phone")
    private int employerPhone;

    @Column(name= "email")
    private String email;

}
