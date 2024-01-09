package com.example.demo;

public class product 
{
	public String pname;
	public int pid;
	public int price;
	@Override
	public String toString() {
		return "product [pname=" + pname + ", pid=" + pid + ", price=" + price + "]";
	}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
