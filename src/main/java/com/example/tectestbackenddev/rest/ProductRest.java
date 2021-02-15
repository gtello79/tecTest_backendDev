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

    @GetMapping
    public ResponseEntity<Nationality> addNationality(){
        Nationality newNation = new Nationality();

        int isoCode = 31662;
        String nationalityName = "Chile";
        int continentID = 0;
        int userUID = 18986470;

        newNation.setNationalityName(nationalityName);
        newNation.setIdContinent(continentID);
        newNation.setUserID(userUID);
        newNation.setIsocode(isoCode);

        return ResponseEntity.ok(newNation);
    }


    @PostMapping
    public ResponseEntity<Nationality> addAnotherNationality(@RequestBody Nationality nationName){
        Nationality newNationality = nationalityDAO.save(nationName);
        return ResponseEntity.ok(newNationality);
    }


}

