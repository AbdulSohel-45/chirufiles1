package com.example.demo;

public class ExcOwnMsg 
{
	private String Demo;
	private String Main;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ExcOwnMsg(String demo, String main, String msg) {
		super();
		Demo = demo;
		Main = main;
		this.msg = msg;
	}
	public String getDemo() {
		return Demo;
	}
	public void setDemo(String demo) {
		Demo = demo;
	}
	public String getMain() {
		return Main;
	}
	public void setMain(String main) {
		Main = main;
	}
}
