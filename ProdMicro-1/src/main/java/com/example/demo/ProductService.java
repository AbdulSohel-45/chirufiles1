package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ProductService
{
	@Autowired
	ProductDao dao;
	public ResponseEntity<List<Product>> getAllProducts(Product product)
	{
		return new ResponseEntity<>(dao.findAll(),HttpStatus.OK);	
	}
	public Product addProduct(Product product)
	{
		return dao.save(product);
	}
	public ResponseEntity<Product> getByName(String pname)
	{
		return new ResponseEntity<>(dao.findByPname(pname),HttpStatus.ACCEPTED);	
	}
	public ResponseEntity<List<Product>> getByQuantity(int pquantity)
	{
		return new ResponseEntity<>(dao.findByPquantity(pquantity),HttpStatus.ACCEPTED);
	}
	public ResponseEntity<Product> getById(int pid)
	{
		try
		{
			return new ResponseEntity<Product>(dao.findById(pid).get(),HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<Product>(new Product(),HttpStatus.BAD_REQUEST);
	}
}
