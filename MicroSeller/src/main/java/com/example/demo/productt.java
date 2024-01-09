package com.example.demo;


public class productt 
{
	private int pid;
	private String pname;
	private int pprice;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "productt [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
}
