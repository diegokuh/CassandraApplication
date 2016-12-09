package com.example.aspect;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.model.GenericModel;

@Aspect
@Component
public class GenericModelAspect {
	
	@Before("execution(* org.springframework.data.repository.CrudRepository.save (..)) && args(model)")
	public void beforeSaveOrUpdate(GenericModel model){
		if(model.getCreated()==null){
			model.setCreated(new Date());
		}
		model.setUpdated(new Date());
	}
}
