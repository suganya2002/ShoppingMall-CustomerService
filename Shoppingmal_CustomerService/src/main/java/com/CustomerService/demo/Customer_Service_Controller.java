package com.CustomerService.demo;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.demo.Mall_Service;
import com.springproject.demo.admin;


@RestController
public class Customer_Service_Controller 
{

	  @Autowired(required=true)
	  private Mall_Service service;
	  
	  @GetMapping("/mall_service")
	  public java.util.List<admin>list()
	  {
		  return service.listAll();
	  }
	  @GetMapping("/mall_service/{admin_Id}")
	  public ResponseEntity <admin> get(@PathVariable Integer Admin_Id)
	  {
		  try
		  {
			admin Admin = service.get(Admin_Id);
			return new ResponseEntity<admin>(Admin,HttpStatus.OK);
		  }
		  catch(NoResultException e)
		  {
			  return new ResponseEntity<admin>(HttpStatus.NOT_FOUND);
		  }
	   
	  }
		  @PostMapping("/mall_service")
		  public void add(@RequestBody admin Admin)
		  {
			  service.save(Admin);
		  }
		  @PutMapping ("/mall_service/{admin_Id}")
		  public ResponseEntity<?> update(@RequestBody admin Admin, @PathVariable Integer Admin_Id)
		  {
			  admin existadmin = service.get(Admin_Id);
			  service.save(existadmin);
			  return new ResponseEntity<>(HttpStatus.OK);
		  }
		  @DeleteMapping("/mall_service/{admin_Id}")
		  public void delete (@PathVariable Integer admin_Id)
		  {
			  service.delete(admin_Id);
		  }
	   
}
