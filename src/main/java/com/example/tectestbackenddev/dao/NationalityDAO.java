package com.example.tectestbackenddev.dao;

import com.example.tectestbackenddev.entitys.Nationality;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalityDAO extends JpaRepository<Nationality, Integer> {
}
