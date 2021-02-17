package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.dao.ProductDAO;
import com.example.tectestbackenddev.dao.TransactionDAO;
import com.example.tectestbackenddev.entitys.Employer;
import com.example.tectestbackenddev.entitys.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/employers")
public class EmployerRest {

    private Employer employer = null;

    @Autowired
    private EmployerDAO employerDAO;

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private TransactionDAO transactionDAO;


    //Aplicar Login
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public boolean UserLogin(String passSaved, int idSaved){

        Optional<Employer> actualUser = employerDAO.findById(idSaved);

        if(actualUser.isPresent()){
            employer = actualUser.get();
            idSaved = employer.getEmployerId();
            passSaved = employer.getEmployerPass();
        }

        return Objects.equals(employer.getEmployerId(),idSaved) && Objects.equals(employer.getEmployerPass(), passSaved);

    }

    //Add a new product
    @RequestMapping(value = "/{employerName}/addProduct", method = RequestMethod.POST)
    public ResponseEntity<Product> addNewProduct(@PathVariable("employerName") String employerName, @RequestBody Product newProduct ){

        Optional<Product> pivProduct = productDAO.findById(newProduct.getIdProduct());
        //Verification is the product is on the DataBase
        if(!pivProduct.isPresent()){
            productDAO.save(newProduct);
        }
        return ResponseEntity.ok(newProduct);

    }

    //Delete a product
    @RequestMapping(value = "/{employerName}", method = RequestMethod.DELETE)
    public ResponseEntity<Product> deleteProduct(@PathVariable("employerName") String employerName, int idProduct){
        Optional<Product> todelete = productDAO.findById(idProduct);

        if(todelete.isPresent()){
            productDAO.deleteById(idProduct);
        }
        return ResponseEntity.ok(null);
    }


    //Get a Products list with all the sold
    @RequestMapping(value = "/productSoldList", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProductList(){
        List<Product> productList = productDAO.findAll();

        //Filtrar productos a partir desde

        return ResponseEntity.ok(productList);
    }

    //edit a product
    @RequestMapping(value="/editProduct",method = RequestMethod.PUT)
    public ResponseEntity<Product> editProduct(@RequestBody Product product){
        Optional<Product> pivProduct = productDAO.findById(product.getIdProduct());
        if(pivProduct.isPresent()){
            Product updateProduct = pivProduct.get();

            updateProduct.setProductPrice(product.getProductPrice());
            updateProduct.setProductName(product.getProductName());
            updateProduct.setIsoCode(product.getIsoCode());

            productDAO.save(updateProduct);
            return ResponseEntity.ok(updateProduct);
        }else{
            return ResponseEntity.notFound().build();
        }

    }

}
