package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Emp;
import com.example.repository.EmpRepository;

@Service
public class EmpService {
	
	private EmpRepository empRepository;
	
	@Autowired
	public EmpService(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}
	
	public void save(Emp emp){
		this.empRepository.save(emp);
	}
}
