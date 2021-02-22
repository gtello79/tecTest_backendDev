package com.example.tectestbackenddev.services;

import com.example.tectestbackenddev.rest.EmployerRest;
import com.example.tectestbackenddev.rest.GeneralRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Resource
@RestController
@RequestMapping("/")
public class Resources {

    GeneralRest generalRest;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean initLogin(){
        Integer simpleName = 18986470;
        String simplepass = "Gonzalo12345";

        GeneralRest generalRest = new GeneralRest();

        return generalRest.UserLogin(simpleName, simplepass);
    }
}
