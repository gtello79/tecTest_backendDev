package com.example.tectestbackenddev.rest;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.dao.ProductDAO;
import com.example.tectestbackenddev.dao.TransactionDAO;

import com.example.tectestbackenddev.dto.ProductDTO;
import com.example.tectestbackenddev.dto.TransactionDTO;
import com.example.tectestbackenddev.entities.Employer;
import com.example.tectestbackenddev.entities.Product;

import com.example.tectestbackenddev.entities.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.transaction.Transactional;

@Setter
@Getter
@ToString
public class EmployerRest {

    private Employer employer;

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private TransactionDAO transactionDAO;

    @Autowired
    private EmployerDAO employerDAO;

    @Transactional
    public ProductDTO createProduct(ProductDTO productDto){
        Product presentProd = productDto.getProduct();
        Optional<Product> prod = productDAO.findById(presentProd.getIdProduct());

        if(prod.isPresent()){
            return productToProductDTO( prod.get() );
        }else{
            productDAO.save(presentProd);
            return productDto;
        }
    }

    @Transactional
    public ProductDTO findProductById(int idProduct){
        Optional<Product> optionalProduct = productDAO.findById(idProduct);
        if(optionalProduct.isPresent()){
            Product consultProduct = optionalProduct.get();
            return new ProductDTO(consultProduct);
        }else{
            return null;
        }

    }

    @Transactional
    public void createTransaction(Transaction newTransaction){
        Time currentTime = new Time(0);
        Date currentDate = new Date(0);

        newTransaction.setTransactionDate(currentDate);
        newTransaction.setTransactionTime(currentTime);

        transactionDAO.save(newTransaction);
    }

    //Add a new product
    @Transactional
    public ResponseEntity<Product> addNewProduct(@RequestBody Product newProduct){
        Optional<Product> pivProduct = productDAO.findById(newProduct.getIdProduct());
        Date instant = new Date(17022021);
        Time currentTime = new Time(1247);

        //Verification if the product is on DataBase
        if(!pivProduct.isPresent()){

            Transaction newTransaction = new Transaction();
            productDAO.save(newProduct);

            newTransaction.setEmployer(employer);
            newTransaction.setProduct(newProduct);
            newTransaction.setTransactionDate(instant);
            newTransaction.setTransactionTime(currentTime);

            transactionDAO.save(newTransaction);
            return ResponseEntity.accepted().build();

        }
        return ResponseEntity.ok(newProduct);

    }

    //Delete a product
    @Transactional
    public boolean deleteProduct(int idProduct){
        Optional<Product> todelete = productDAO.findById(idProduct);
        boolean deleted = false;
        if(todelete.isPresent()){
            productDAO.deleteById(idProduct);
            deleted = true;
        }
        return deleted;
    }

    //Get a sold product
    @Transactional
    public ArrayList<ProductDTO> getProductSold(int idType){
        ArrayList<Transaction> transactionList = transactionDAO.findByTransactionType(idType);
        ArrayList<ProductDTO> soldProducts = new ArrayList<>();

        for(Transaction t: transactionList){
            Optional soldProduct = productDAO.findById( t.getProduct().getIdProduct() );
            ProductDTO toAdd = productToProductDTO( (Product) soldProduct.get() );
            soldProducts.add( toAdd );
        }

        return soldProducts;
    }

    @Transactional
    public ProductDTO editProduct(ProductDTO productDTO){

        Optional<Product> pivProduct = productDAO.findById(productDTO.getProductId());

        if(pivProduct.isPresent()){
            Product updateProduct = pivProduct.get();

            updateProduct.setProductPrice(productDTO.getProductPrice());
            updateProduct.setProductName(productDTO.getProductName());
            updateProduct.setIsoCode(productDTO.getIsoCode());

            productDAO.save(updateProduct);
            return productToProductDTO(updateProduct);

        }else{

            return productToProductDTO(pivProduct.get());

        }
    }

    @Transactional
    public boolean editTransaction(@RequestBody TransactionDTO newTransaction){
        Optional<Transaction> pivTransaction = transactionDAO.findById(newTransaction.getTransactionId());
        boolean editedOption = false;

        if(pivTransaction.isPresent()){
            editedOption = true;
            Transaction editedTransaction = pivTransaction.get();

            int currentTypeId = editedTransaction.getTransactionId();
            Time currentTime = new Time(0);
            Date currentDate = new Date(0);

            editedTransaction.setTransactionTime(currentTime);
            editedTransaction.setTransactionDate(currentDate);
            editedTransaction.setTransactionId(currentTypeId);

            transactionDAO.save(editedTransaction);

        }
        return editedOption;
    }

    public ProductDTO productToProductDTO(Product product){
        return new ProductDTO(product);
    }


}
