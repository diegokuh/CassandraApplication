package com.example.aspect;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.model.Emp;

@Aspect
@Component
public class EmpServiceAspect {
	
	@Before("execution(* com.example.service.EmpService.save (com.example.model.Emp)) && args(emp)")
	public void beforeSaveOrUpdate(Emp emp){
		if(emp.getEmpCreated()==null){
			emp.setEmpCreated(new Date());
		}
		emp.setEmpUpdated(new Date());
	}
}
