package com.example.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employe;
@Repository
public interface EmpRepository extends JpaRepository<Employe, Integer> {

}
