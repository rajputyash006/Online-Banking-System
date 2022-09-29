package com.masai.dao;

import java.util.List;

import com.masai.model.Customer;

public interface CustomerDao {
	
    public String customerRegistration(Customer customer);

	public double viewBalance();
	
	public double fundTransefer();
	
	public List<String> viewTransactions();
	
	public List<String> view_Last_10_Transactions();
	
	public List<String> viewAccountStatements();
	
	public List<String> atmBankLocator();
	
	public String orderChequeBookCards();
	
}
