package com.example.tectestbackenddev.services;

import com.example.tectestbackenddev.dto.ProductDTO;
import com.example.tectestbackenddev.entities.Employer;
import com.example.tectestbackenddev.entities.Product;
import com.example.tectestbackenddev.entities.Transaction;
import com.example.tectestbackenddev.rest.EmployerRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@Api(value="my-market")

public class Resources {

    EmployerRest employerRest;

    Employer currentEmployer;

    // Add Product
    @RequestMapping(value = "/{employerName}/addProduct", method = RequestMethod.POST)
    public ProductDTO addProduct(@PathVariable("employerName") String employerName
                                ,@RequestBody ProductDTO newProduct)
    {
        return employerRest.createProduct(newProduct);
    }

    // Delete a product
    @RequestMapping(value = "/{employerName}", method = RequestMethod.DELETE)
    public boolean deleteProduct (@PathVariable("employerName") String employerName,
                                  int idProduct)
    {
        return employerRest.deleteProduct(idProduct);
    }

    // Get Product sold Lists
    @RequestMapping(value = "/productSoldList", method = RequestMethod.GET)
    public ArrayList<ProductDTO> getProductSold()
    {
        int idType = 2;
        ArrayList<ProductDTO> allProducts = employerRest.getProductSold(idType);
        return null;
    }


    // Edit a product
    @RequestMapping(value = "/editProduct", method = RequestMethod.PUT)
    public ProductDTO editProduct(@RequestBody ProductDTO productdto) {

        return employerRest.editProduct(productdto);
    }

    // Edit a transaction
    @RequestMapping(value = "/editTransaction", method = RequestMethod.POST)
    public ResponseEntity<Transaction> editTransaction(@RequestBody Transaction newTransaction){
        return null;
    }


}