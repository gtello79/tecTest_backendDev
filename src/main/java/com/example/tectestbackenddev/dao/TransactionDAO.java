package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entitys.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDAO extends JpaRepository<Transaction, Integer> {
}
