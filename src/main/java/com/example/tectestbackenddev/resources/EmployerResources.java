package com.example.tectestbackenddev.resources;


import com.example.tectestbackenddev.resources.dto.ProductDTO;
import com.example.tectestbackenddev.resources.dto.TransactionDTO;
import com.example.tectestbackenddev.service.EmployerService;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="my_market")
public class EmployerResources {

    @Autowired
    EmployerService employerRest;


    // Add Product
    @RequestMapping(value = "{employerName}/addProduct", method = RequestMethod.PUT)
    public ProductDTO addProduct(@PathVariable("employerName") String employerName
                                ,@RequestBody ProductDTO newProduct)
    {
        return employerRest.createProduct(newProduct);
    }



    // Delete a product
    @RequestMapping(value = "{employerName}", method = RequestMethod.DELETE)
    public boolean deleteProduct (@PathVariable("employerName") String employerName,
                                  int idProduct)
    {

        return employerRest.deleteProduct(idProduct);
    }

    // Get Product sold Lists
    @RequestMapping(value = "productSoldList", method = RequestMethod.GET)
    public List<ProductDTO> getProductSold()
    {
        int idType = 2;
        List<ProductDTO> allProducts = employerRest.getProductSold(idType);
        return allProducts;
    }


    // Edit a product
    @RequestMapping(value = "editProduct", method = RequestMethod.POST)
    public ProductDTO editProduct(@RequestBody ProductDTO productdto)
    {
        return employerRest.editProduct(productdto);
    }


    // Edit a transaction
    @RequestMapping(value = "editTransaction", method = RequestMethod.POST)
    public boolean editTransaction(@RequestBody TransactionDTO newTransaction){
        return employerRest.editTransaction(newTransaction);
    }

}