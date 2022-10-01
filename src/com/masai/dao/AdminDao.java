package com.masai.dao;

import java.util.List;

import com.masai.Exception.CustomerException;
import com.masai.model.Customer;

public interface AdminDao {

	public  Customer customerDetails(int accNo) throws CustomerException;
	
	public String updateCustomerFirstName(int acc,String fname) throws CustomerException;
	
	public String updateCustomerLastName(int acc,String lname) throws CustomerException;
	
	public String updateCustomerMobileNo(int acc,String mobile) throws CustomerException;
	
	public String updateCustomerEmail(int acc,String email) throws CustomerException;
	
	public String updateCustomerUserName(int acc,String username) throws CustomerException;
	
	public String updateCustomerPassword(int acc,String password) throws CustomerException;
	
	public String closeCustomerAccount(int accNo) throws CustomerException;
	
	public List<Customer> allCustomerView() throws CustomerException;
	
}
