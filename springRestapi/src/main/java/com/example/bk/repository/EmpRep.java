package com.example.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bk.entities.Employe;
@Repository
public interface EmpRep extends JpaRepository<Employe, Integer> {
	@Query(value="select * from employeee where id=:id",nativeQuery = true)
	public Employe findByid(int id);
	public Employe findByName(String name);

}
