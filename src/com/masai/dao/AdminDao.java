package com.masai.dao;

import java.util.List;

import com.masai.model.Customer;

public interface AdminDao {

	public  Customer customerDetails(int accNo);
	
	public String updateCustomerFirstName(int acc,String fname);
	
	public String updateCustomerLastName(int acc,String lname);
	
	public String updateCustomerMobileNo(int acc,String mobile);
	
	public String updateCustomerEmail(int acc,String email);
	
	public String updateCustomerUserName(int acc,String username);
	
	public String updateCustomerPassword(int acc,String password);
	
	public String closeCustomerAccount(int accNo);
	
	public List<Customer> allCustomerView();
	
}
