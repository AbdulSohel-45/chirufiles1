package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ExcHai extends ResponseEntityExceptionHandler
{
	@ExceptionHandler
	public ResponseEntity<ExcOwnMsg> demo2(ExcMyException my)
	{
		ExcOwnMsg hi=new ExcOwnMsg("hello","all",my.getMsg());
		return new ResponseEntity<>(hi,HttpStatus.NOT_FOUND);
	}
}
