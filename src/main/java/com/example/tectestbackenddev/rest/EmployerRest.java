package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.dao.ProductDAO;
import com.example.tectestbackenddev.dao.TransactionDAO;
import com.example.tectestbackenddev.entitys.Employer;
import com.example.tectestbackenddev.entitys.Product;

import com.example.tectestbackenddev.entitys.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
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


    //User Login
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public boolean UserLogin(String passSaved, int idSaved){

        Optional<Employer> actualUser = employerDAO.findById(idSaved);

        if(actualUser.isPresent()) {
            employer = actualUser.get();
            idSaved = employer.getEmployerId();
            passSaved = employer.getEmployerPass();
            return Objects.equals(employer.getEmployerId(), idSaved) && Objects.equals(employer.getEmployerPass(), passSaved);

        }else
            return false;


    }

    //Add a new product
    @RequestMapping(value = "/{employerName}/addProduct", method = RequestMethod.POST)
    public ResponseEntity<Product> addNewProduct(@PathVariable("employerName") String employerName, @RequestBody Product newProduct){
        Optional<Product> pivProduct = productDAO.findById(newProduct.getIdProduct());
        Date instant = new Date(17022021);
        Time currentTime = new Time(1247);


        //Verification if the product is on DataBase
        if(!pivProduct.isPresent()){

            Transaction newTransaction = new Transaction();
            productDAO.save(newProduct);

            newTransaction.setEmployerId(employer.getEmployerId());
            newTransaction.setProductId(newProduct.getIdProduct());
            newTransaction.setTransactionDate(instant);
            newTransaction.setTransactionTime(currentTime);

            transactionDAO.save(newTransaction);
            System.out.println("MENSAJE DE ACEPTADO");
            return ResponseEntity.accepted().build();

        }
        System.out.println("MENSAJE DE NO ACEPTADO");
        return ResponseEntity.ok(newProduct);


    }

    //Delete a product
    @RequestMapping(value = "/{employerName}", method = RequestMethod.DELETE)
    public ResponseEntity<Product> deleteProduct(@PathVariable("employerName") String employerName, int idProduct){
        Optional<Product> todelete = productDAO.findById(idProduct);

        if(todelete.isPresent()){
            productDAO.deleteById(idProduct);
        }
        return ResponseEntity.notFound().build();
    }


    //Get a Products list with all the sold
    @RequestMapping(value = "/productSoldList", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Product>> getProductSold(){
        int idType = 2;
        List<Transaction> transactionList = transactionDAO.findAll();
        ArrayList<Product> soldProducts = new ArrayList<>();

        for(Transaction t: transactionList){
            if(t.getTransactionTypeId() == idType){
                Product soldProduct = productDAO.findById(t.getProductId()).get();
                soldProducts.add(soldProduct);
            }
        }
        return ResponseEntity.ok(soldProducts);
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

    //Edit a transaction
    @RequestMapping(value = "/editTransaction", method = RequestMethod.POST)
    public ResponseEntity<Transaction> editTransaction(@RequestBody Transaction newTransaction){
        Optional<Transaction> pivTransaction = transactionDAO.findById(newTransaction.getTransactionId());
        if(pivTransaction.isPresent()){
            Transaction editedTransaction = pivTransaction.get();
            editedTransaction.setTransactionTime(newTransaction.getTransactionTime());
            editedTransaction.setTransactionDate(newTransaction.getTransactionDate());
            editedTransaction.setTransactionTypeId(newTransaction.getTransactionTypeId());

            transactionDAO.save(editedTransaction);
            return ResponseEntity.ok(editedTransaction);
        }else{
            return ResponseEntity.notFound().build();
        }

    }


}
