package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<Product, Integer> {
}
