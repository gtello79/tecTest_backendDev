package com.example.tectestbackenddev.resources.dto;

import com.example.tectestbackenddev.entities.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductDTO {

    private int productId;

    private String productName;

    private int isoCode;

    private double productPrice;

    public ProductDTO(Product product){
        this.productName = product.getProductName();
        this.isoCode = product.getIsoCode();
        this.productId = product.getIdProduct();
    }

    public Product getProduct(){
        Product newProduct = new Product();
        newProduct.setIdProduct(productId);
        newProduct.setIsoCode(isoCode);
        newProduct.setProductName(productName);
        newProduct.setProductPrice(productPrice);

        return newProduct;
    }

}
