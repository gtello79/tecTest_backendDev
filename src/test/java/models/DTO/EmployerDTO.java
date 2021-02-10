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

import models.DAO.EmployerDAO;

@Setter
@Getter
@ToString

@Entity
@table(name='Employer')

public class EmployerDTO implements EmployerDAO{

    @Id
    @Column(name = "IdEmployer")
    private int IdEmployer;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Password")
    private String password;


}
