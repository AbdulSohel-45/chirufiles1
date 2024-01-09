package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
public class MyController
{
	Logger logger=LoggerFactory.getLogger(MyController.class);
	@Autowired
	public DaoInterface dao;
	@Autowired
	public ShopDao sDao;
	
	@PostMapping("/addProduct")
	public ProductEntity addProduct(ProductEntity product)
	{
		return dao.save(product);
	}
	@GetMapping("/getProduct")
	public List<ProductEntity> getProduct()
	{
		return  dao.findAll();
	}
	@GetMapping("/getshops")
	public ResponseEntity<List<Shop>> getshop(){
		return new ResponseEntity<List<Shop>>(sDao.findAll(),HttpStatus.ACCEPTED);  
	}
	@PostMapping("/addShop")
	public ResponseEntity<Shop> addShop(@RequestBody Shop shop)
	{
		
		List<ProductEntity> l=shop.getProduct();
		for(ProductEntity p : l)
		{
			Optional<ProductEntity> o=dao.findById(p.getPid());
			if(!o.isPresent())
			{
				dao.save(p);
			}
		}
		Shop s=sDao.save(shop);
		return new ResponseEntity<Shop>(s,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/getByShop/{sid}")
	public ResponseEntity<Shop> findById(@PathVariable int sid)
	{
		return new ResponseEntity<Shop>(sDao.findBySid(sid),HttpStatus.OK);
	}
}
