package com.webapi.APIcrud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApiEntity {

	@Id
	private String id;
	private String name;
	public ApiEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiEntity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AOPEntity [id=" + id + ", name=" + name + "]";
	}
	
	
}
