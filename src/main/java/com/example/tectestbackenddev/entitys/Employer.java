package com.example.tectestbackenddev.entitys;

import javax.persistence.*;

import lombok.*;

import java.util.ArrayList;

@Setter
@Getter
@ToString

@Entity
@Table(name = "Employer")
public class Employer {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmployer;

    @Column(name = "Name")
    private String name;

    @Column(name = "Password")
    private String password;

    public int calculateProduct(ArrayList<Transaction> mytransactions){
        int count = 0;
        double mount = 0;

        //Aqui debo consultar la accion a realizar
        int typeProcess = 0;
        for(Transaction p: mytransactions){
            if(typeProcess == p.getIdTransaction()){
                count++;
            }
        }

        return count;
    }

}
