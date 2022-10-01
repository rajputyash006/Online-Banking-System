package com.masai.dao;

import java.util.List;

import com.masai.model.Customer;

public interface CustomerDao {
	
    public String customerRegistration(Customer customer);
	
	public String fundTransefer(Customer cuss,int accNo,double amt);
	
	public List<String> viewTransactions(Customer cus);
	
	public List<String> view_Last_5_Transactions(Customer cus);
	
	public List<String> viewAccountStatements(Customer customer,int year);
	
	public List<String> atmBankLocator();
	
	public Customer provideUserObject(String username);

	public String getUserName(int accId, int aadhar, int otp);

	public String getUserPassword(int accId1, int aadhar1, int otp1);

	
}
