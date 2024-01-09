package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class UserMessageConverter extends AbstractHttpMessageConverter<Employee>
{
	public UserMessageConverter()
	{
		super(new MediaType("Text","Employee"));
	}
	@Override
	protected boolean supports(Class<?> clazz) 
	{
		return Employee.class.isAssignableFrom(clazz);
	}
	@Override
	protected Employee readInternal(Class<? extends Employee> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException 
	{
		String Requestmessage=toEmployeemessage(inputMessage.getBody());
		System.out.println(Requestmessage);
		String s[]=Requestmessage.split("\n");
		int i=Requestmessage.indexOf("\n");
		if(i==1)
		{
			throw new HttpMessageNotReadableException("No first line found", inputMessage);
		}
		String name=s[0].trim();
		System.out.println(name);
		int id=Integer.valueOf(s[1].trim());
		System.out.println("id"+id);
		String location=s[2].trim();
		System.out.println("location = "+location);
		Employee employee=new Employee();
		employee.setName(name);
		employee.setId(id);
		employee.setLocation(location);
		return employee;
	}
	private String toEmployeemessage(InputStream body) 
	{
		Scanner sc=new Scanner(body,"UTF-8");
		return sc.useDelimiter("\\A").next();
	}
	@Override
	protected void writeInternal(Employee t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException 
	{
		OutputStream out=outputMessage.getBody();
		String body=t.getName()+"\n "+t.getId()+"\n "+t.getLocation();
		out.write(body.getBytes());
		out.close();
		
	}
}
