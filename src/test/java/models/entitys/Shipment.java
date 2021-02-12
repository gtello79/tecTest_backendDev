package models.entitys;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@ToString

@Entity
@Table(name="Shipment")
public class Shipment {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



}
