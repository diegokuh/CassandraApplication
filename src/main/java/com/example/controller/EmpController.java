package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Emp;
import com.example.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	private EmpService empService;
	
	@Autowired
	public EmpController(EmpService empService) {
		this.empService = empService;
	}

	@RequestMapping("/save")
	public String saveEmp(){
		Emp emp = new Emp();
		emp.setEmpId(1);
		emp.setEmpName("Diego");
		empService.save(emp);
		return "Emp saved";
	}
}
