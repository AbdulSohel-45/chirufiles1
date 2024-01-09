package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity
{
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private int pprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
}
