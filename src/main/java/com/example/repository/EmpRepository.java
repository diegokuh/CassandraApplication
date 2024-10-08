package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Emp;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Long> {

}
