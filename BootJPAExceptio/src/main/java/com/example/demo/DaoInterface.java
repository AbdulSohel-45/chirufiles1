package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoInterface extends JpaRepository<Employee, Integer> 
{

}
