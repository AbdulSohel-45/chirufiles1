package com.example.demo;

import java.util.List;

public class shopp 
{
	private int id;
	private String name;
	private int sid;
	private List<productt> product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public List<productt> getProduct() {
		return product;
	}
	public void setProduct(List<productt> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "shopp [id=" + id + ", name=" + name + ", sid=" + sid + ", product=" + product + "]";
	}
	
	
}
