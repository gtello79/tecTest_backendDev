package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Objects;
import java.util.Optional;

public class GeneralRest {

    @Autowired
    private EmployerDAO employerDAO;

    private EmployerRest employerRest;

    //User Login
    public boolean UserLogin(int idSaved, String passSaved){

        Optional<Employer> actualUser = employerDAO.findById(idSaved);
        Employer test;

        employerRest = new EmployerRest();
        if(actualUser.isPresent()) {
            test = actualUser.get() ;
            idSaved = test.getEmployerId();
            passSaved = test.getEmployerPass();
            employerRest.setEmployer(test);
            return Objects.equals(test.getEmployerId(), idSaved) && Objects.equals(test.getEmployerPass(), passSaved);
        }else
            return false;

    }

}
