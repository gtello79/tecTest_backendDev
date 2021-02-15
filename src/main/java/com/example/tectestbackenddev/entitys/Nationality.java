package com.example.tectestbackenddev.entitys;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name="nationality")
public class Nationality {
    @Id
    @Column(name = "isoCode")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int isoCode;

    @Column(name="nationalityName")
    String nationalityName;

    @Column(name="idContinent")
    int idContinent;

    @Column(name="userID")
    int userID;

}
