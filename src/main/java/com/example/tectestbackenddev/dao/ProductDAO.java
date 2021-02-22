package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Integer> {
}
