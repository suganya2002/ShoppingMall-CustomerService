package com.CustomerService.demo;

	
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Customer {

		private Integer Customer_Id;
		private String Customer_name;
		private String Customer_Address;
		private Integer Ph_Number;
		
		
			public Customer()
			{
				super();
			}
			
			public Customer(Integer customer_Id, String customer_name, String customer_Address, Integer ph_Number)
			{
				super();
				Customer_Id = customer_Id;
				Customer_name = customer_name;
				Customer_Address = customer_Address;
				Ph_Number = ph_Number;
		
			}
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			
			public  Integer getCustomer_Id() {
				return Customer_Id;
			}
			
			public void setCustomer_Id(Integer customer_Id) {
				Customer_Id = customer_Id;
			}
			
			public String getCustomer_name() {
				return Customer_name;
			}
			
			public void setCustomer_name(String customer_name) {
				Customer_name = customer_name;
			}
			
			public String getCustomer_Address() {
				return Customer_Address;
			}
			
			public void setCustomer_Address(String customer_Address) {
				Customer_Address = customer_Address;
			}
			
			public Integer getPh_Number() {
				return Ph_Number;
			}
			
			public void setPh_Number(Integer ph_Number) {
				Ph_Number = ph_Number;
			}
			
			@Override
			
			public String toString()
			{
				return "Customer[Customer id:"+Customer_Id+" Customer Name"+Customer_name+"Customer_Address"+Customer_Address+"Phone Number"+Ph_Number+"]";
			}
			

}
