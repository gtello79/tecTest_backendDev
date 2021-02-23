package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TransactionDAO extends CrudRepository<Transaction, Integer> {

    ArrayList<Transaction> findByTransactionType(int transactionType);
}
