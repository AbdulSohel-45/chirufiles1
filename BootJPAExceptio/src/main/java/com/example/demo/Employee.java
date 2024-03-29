package com.example.demo;

import org.springframework.hateoas.EntityModel;

import jakarta.annotation.Resource;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee
{
	private String name;
	@Id
	private int id;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", location=" + location + "]";
	}
	
}
