package com.example.demo;

import java.util.Arrays;

public class AppDefault 
{
	private String user;
	private String pwd;
	private String [] cool;
	@Override
	public String toString() {
		return "AppDefault [user=" + user + ", pwd=" + pwd + ", cool=" + Arrays.toString(cool) + "]";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String[] getCool() {
		return cool;
	}
	public void setCool(String[] cool) {
		this.cool = cool;
	}
}
