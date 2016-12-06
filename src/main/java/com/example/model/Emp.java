package com.example.model;

import java.util.Date;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Emp {
	@PrimaryKey
	private Integer empId;
	private String empName;
	private Date empCreated;
	private Date empUpdated;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getEmpCreated() {
		return empCreated;
	}
	public void setEmpCreated(Date empCreated) {
		this.empCreated = empCreated;
	}
	public Date getEmpUpdated() {
		return empUpdated;
	}
	public void setEmpUpdated(Date empUpdated) {
		this.empUpdated = empUpdated;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empCreated=" + empCreated + ", empUpdated="
				+ empUpdated + "]";
	}
	
	
}
