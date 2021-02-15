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
    @Column(name = "isocode")
    private int isocode;

    @Column(name="nationalityname")
    String nationalityName;

}
