package com.masai.dao;

import java.util.List;

import com.masai.model.Customer;

public interface AdminDao {

	public  Customer customerDetails(int accNo);
	
	public String updateCustomerDetails(Customer customer);
	
	public String closeCustomerAccount(Customer customer);
	
	public List<Customer> allCustomerView();
	
}
