package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.entitys.Employer;
import com.example.tectestbackenddev.entitys.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("")
public class EmployerRest {

    private Employer actual;
    private EmployerDAO actualDAO;

    //Aplicar Login
    @GetMapping
    public boolean UserLogin(String id, String pass ){
        //obtener consulta desde BD sobre la informacion del usuario
        String idSaved = "";
        String passSaved = "";
        /*
        if( !Objects.equals(La clase, null) ){
            actual = (LA CLASE DEL USUARIO)
            idSaved = actual.id;
            passSaved = actual.passSaved;
        }
        */
        return Objects.equals(id,idSaved) && Objects.equals(pass, passSaved);
    }

    /*
    //Consultar el listado de productos vendidos
    @RequestMapping(value = "/{actualName}/ProductList", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProductList(){
        //Consultar los listados de productos vendidos por el empleado
        ArrayList<Product> employersProducts = null;
        return ResponseEntity.ok(employersProducts);
    }*/

    //Ingresar productos

    //Editar Productos

    //Eliminar Productos

    //Consultar saldo historico de las ventas

}
