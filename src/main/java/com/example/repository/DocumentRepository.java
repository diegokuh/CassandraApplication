package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Integer> {

}
