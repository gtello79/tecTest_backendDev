package models.DTO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import models.DAO.NationalityDAO;

@Setter
@Getter
@ToString

@Entity

@table(name='Nationality')

public class NationalityDTO implements NationalityDAO {

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
