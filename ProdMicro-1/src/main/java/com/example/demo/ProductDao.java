package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>
{
	public Product findByPname(String pname);
	public List<Product> findByPquantity(int pquantity);
}
