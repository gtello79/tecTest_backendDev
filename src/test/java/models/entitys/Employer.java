package models.entitys;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name="Employer")
public class Employer{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmployer;

    @Column(name="Name")
    private String name;

    @Column(name="Password")
    private String password;

}
