package models.bussines;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@table(name='Product')

public class Product {

    @Id
    @Column(name="IDProduct")
    private int IDProduct;

    @Column(name="Serial")
    private int Serial;

    @Column(name="Name")
    private String Name;

    @Column(name="")
    private double ;


}
