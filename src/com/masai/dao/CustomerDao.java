package com.masai.dao;

import java.util.List;

import com.masai.model.Customer;

public interface CustomerDao {
	
    public String customerRegistration(Customer customer);
	
	public String fundTransefer(Customer cuss,int accNo,double amt);
	
	public List<String> viewTransactions();
	
	public List<String> view_Last_5_Transactions(Customer cus);
	
	public List<String> viewAccountStatements();
	
	public List<String> atmBankLocator();
	
	public String orderChequeBookCards();
	
	public Customer provideUserObject(String username);
	
}
