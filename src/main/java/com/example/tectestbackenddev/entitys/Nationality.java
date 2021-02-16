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
    @Column(name = "iso_code")
    private int isoCode;

    @Column(name="country_name")
    String countryName;

}
