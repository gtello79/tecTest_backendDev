package com.example.tectestbackenddev.resources.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmployerDTO {
    private String name;

    private int UID;

    private double mount;

    private int totalSold;

}
