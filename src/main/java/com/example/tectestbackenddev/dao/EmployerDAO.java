package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entities.Employer;
import org.springframework.data.repository.CrudRepository;

public interface EmployerDAO extends CrudRepository<Employer, Integer> {
}
