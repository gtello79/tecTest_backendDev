package com.example.tectestbackenddev.entities;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name = "employer")
public class Employer {
    @Id
    @Column(name = "employerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employerId;

    @Column(name = "employerName")
    private String employerName;

    @Column(name = "employerPass")
    private String employerPass;


}
