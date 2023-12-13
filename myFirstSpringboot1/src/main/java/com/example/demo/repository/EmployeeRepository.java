package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Employe;

public interface EmployeeRepository extends JpaRepository<Employe, Integer> {
@Query(value="select * from employeee where name=:name",nativeQuery = true)
	public Employe findByString(String name);

  public List<Employe> findByexp(int exp);
	

}
