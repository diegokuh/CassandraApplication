package com.example.model;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Document extends GenericModel {
	@PrimaryKey
	private Integer id;
	private String docName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", docName=" + docName + "]";
	}
	
	
}
