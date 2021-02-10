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

@Setter
@Getter
@ToString

@Entity
@table(name='Product')

public class ProductDTO {

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
