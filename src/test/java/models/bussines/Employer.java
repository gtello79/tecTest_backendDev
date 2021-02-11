package models.bussines;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@table(name='Employer')

public class Employer{

    @Id
    @Column(name = "IdEmployer")
    private int idEmployer;

    @Column(name = "Name")
    private String name;

    @Column(name = "Password")
    private String password;

    public Product enchargedProduct(Transaction toMark2, Product toMark, int option){
        toMark.setName(this.name);
        return toMark;
    }

}
