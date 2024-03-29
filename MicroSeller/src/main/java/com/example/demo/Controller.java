package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller 
{
	@Autowired
	SellerDao dao;
	@Autowired
	SellerUserFeign seller;
//	@Autowired
//	RestTemplate temp;
	@GetMapping("/getById/{sid}")
	public ResponseEntity<SellerEntity> findById(@PathVariable int sid)
	{
		return new ResponseEntity<SellerEntity>(dao.findById(sid).get(),HttpStatus.OK);
	}
	@PostMapping("/addProduct")
	public ResponseEntity<SellerEntity> addProduct(SellerEntity seller)
	{
		return new ResponseEntity<SellerEntity>(dao.save(seller),HttpStatus.OK);
	}
	@GetMapping("/getByDet/{sid}")
	public ResponseEntity<?> Details(@PathVariable int sid)
	{
//		ResponseEntity<shopp> res= temp.exchange
//				("http://localhost:8080/getByShop/"+sid, HttpMethod.GET,null,new ParameterizedTypeReference<shopp>() {
//		});
		ResponseEntity<shopp> res=seller.findById(sid);
		return res;	
	}
	@GetMapping("/getDet")
	public ResponseEntity<?> Det()
	{
		List<productt> res=seller.getProduct();
		return new ResponseEntity<List<productt>>(res,HttpStatus.ACCEPTED);	
	}
}
