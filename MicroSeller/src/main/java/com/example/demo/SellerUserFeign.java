package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
//@FeignClient(name="MicroProduct",url="http://localhost:8090/")
@FeignClient(name="PRODUCTTT")
public interface SellerUserFeign 
{
	@GetMapping("/getByShop/{sid}")
	public ResponseEntity<shopp> findById(@PathVariable int sid);
	@GetMapping("/getProduct")
	public List<productt> getProduct();
}
