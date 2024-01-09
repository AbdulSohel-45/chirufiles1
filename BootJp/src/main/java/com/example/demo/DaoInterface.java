package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DaoInterface extends CrudRepository<product, Integer>
{
//	List<product> FindBypname(String pname);
//	
//	List<product> FindBypidGreaterThan(int pid);
//	
//	@Query("from product where pname=?1 order by pname")
//	List<product> FindBypnameSorted(String pname);
}
