package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ShopDao extends JpaRepository<Shop, Integer>
{
	public Shop findBySid(int id);
}
