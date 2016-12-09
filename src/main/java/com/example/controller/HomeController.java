package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Document;
import com.example.model.Emp;
import com.example.service.DocumentService;
import com.example.service.EmpService;

@RestController
public class HomeController {
	
	private EmpService empService;
	private DocumentService documentService;
	
	@Autowired
	public HomeController(EmpService empService,DocumentService documentService) {
		this.empService = empService;
		this.documentService = documentService;
	}

	@RequestMapping("/emp/save")
	public String saveEmp(){
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Diego");
		empService.save(emp);
		return "Emp saved";
	}
	
	@RequestMapping("/doc/save")
	public String saveDoc(){
		Document doc = new Document();
		doc.setId(1);
		doc.setDocName("Text File");
		documentService.save(doc);
		return "Document saved";
	}
}
