package models.bussines;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Setter
@Getter
@ToString

@Entity

@table(name='Nationality')

public class Nationality {

    @Id
    @Column(name = "ISOCODE")
    private int isoCode;

    @Column(name = "countryName")
    private int countryName;

    @Column(name = "Continent")
    private int continent;

    @Column(name = "userID")
    private String userID;

}
