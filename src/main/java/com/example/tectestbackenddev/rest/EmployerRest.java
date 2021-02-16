package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.entitys.Employer;
import com.example.tectestbackenddev.entitys.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("")
public class EmployerRest {

    private Employer employer;

    @Autowired
    private EmployerDAO employerDAO;

    //Aplicar Login
    @RequestMapping(value="/loginUser", method = RequestMethod.GET)
    public ResponseEntity<Employer> UserLogin(){

        //obtener consulta desde BD sobre la informacion del usuario
        int idSaved = 18986470;
        String passSaved = "";

        Optional<Employer> actualUser = employerDAO.findById(idSaved);

        if(actualUser.isPresent()){
            employer = actualUser.get();
            idSaved = employer.getEmployerId();
            passSaved = employer.getEmployerPass();
        }

        return ResponseEntity.ok(employer);
    }


    //Consultar el listado de productos vendidos
    @RequestMapping(value = "/{actualName}/ProductList", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProductList(){
        //Consultar los listados de productos vendidos por el empleado
        List<Product> employersProducts = null;
        return ResponseEntity.ok(employersProducts);
    }

    //Ingresar productos

    //Editar Productos

    //Eliminar Productos

    //Consultar saldo historico de las ventas

}
