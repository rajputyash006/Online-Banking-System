package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.model.Customer;
import com.masai.utility.DBUtil;

public class AdminImpl implements AdminDao{

	@Override
	public Customer customerDetails(int accNo) {
		Customer customer=new Customer();
		
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from customers where accountNumber=?");
			ps.setInt(1, accNo);
			
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				String accType=rs.getString("accountType");
				String fName=rs.getString("firstName");
				String lName=rs.getString("lastName");
				String gender=rs.getString("gender");
				String mobNo=rs.getString("mobileNo");
				String email=rs.getString("email");
				String userName=rs.getString("userName");
				String pass=rs.getString("password");
				double Bal=rs.getDouble("openingBalance");
				
				customer.setAccountNumber(accNo);
				customer.setAccountType(accType);
				customer.setFirstName(fName);
				customer.setLastName(lName);
				customer.setGender(gender);
				customer.setMobileNo(mobNo);
				customer.setEmail(email);
				customer.setUsername(userName);
				customer.setPassword(pass);
				customer.setAccountBalance(Bal);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return customer;
	}

	@Override
	public String updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeCustomerAccount(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> allCustomerView() {
		// TODO Auto-generated method stub
		return null;
	}

}
