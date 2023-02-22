package com.CustomerService.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Customer_Service {
	
	@Autowired
	private Customer_Service_Repository repo;
	
	   public List<Customer> listAll()
    {
  	  return repo.findAll();
    }
    
    public void save(Customer customer)
    {
  	  repo.save(customer);
    }
    
    public Customer get(Integer Customer_Id)
    {
  	  return repo.findById(Customer_Id).get();
    }
    
    public void delete(Integer Customer_Id)
    {
  	  repo.deleteById(Customer_Id);
    }

}

