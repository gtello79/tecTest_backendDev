package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.NationalityDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.tectestbackenddev.entitys.*;

@RestController
@RequestMapping("/")
class ProductRest {

    @Autowired
    private NationalityDAO nationalityDAO;

    @PostMapping
    public ResponseEntity<Nationality> addAnotherNationality(@RequestBody Nationality nationName){
        Nationality newNationality = nationalityDAO.save(nationName);
        return ResponseEntity.ok(newNationality);
    }


}

