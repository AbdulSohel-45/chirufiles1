package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController 
{
	@Autowired
	DaoInterface dao;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addProduct")
	@ResponseBody
	public product app(product product)
	{
		return dao.save(product);	
	}
	@RequestMapping("/getProduct")
	public ModelAndView app2(int pid)
	{
		ModelAndView mv=new ModelAndView("view.jsp");
		Optional<product> product=dao.findById(pid);	
//		System.out.println(dao.FindBypidGreaterThan(2));
//		System.out.println(dao.FindBypname("chair"));
		mv.addObject("aa",product);
		return mv;	
	}
	@RequestMapping("/delProduct/{pid}")
	@ResponseBody
	public String del(@PathVariable int pid)
	{
		dao.deleteById(pid);
		return "deleted successfully";
	}
	@RequestMapping("/Products")
	@ResponseBody
	public List<product> getProducts()
	{
		return (List<product>) dao.findAll();
	}
	@RequestMapping("/Product/{pid}")
	@ResponseBody
	public Optional<product> getProduct(@PathVariable("pid") int pid)
	{
		return dao.findById(pid);
	}
}
