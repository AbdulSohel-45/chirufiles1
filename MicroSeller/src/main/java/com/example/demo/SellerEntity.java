package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class SellerEntity 
{
	@Id
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "SellerEntity [sid=" + sid + ", sname=" + sname + "]";
	}
	
}