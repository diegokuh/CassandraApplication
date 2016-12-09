package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Document;
import com.example.repository.DocumentRepository;

@Service
public class DocumentService {
private DocumentRepository documentRepository;
	
	@Autowired
	public DocumentService(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}
	
	public void save(Document doc){
		this.documentRepository.save(doc);
	}
}
