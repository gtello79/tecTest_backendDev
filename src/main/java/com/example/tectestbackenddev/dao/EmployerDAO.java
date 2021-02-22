package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDAO extends JpaRepository<Employer, Integer> {
}
