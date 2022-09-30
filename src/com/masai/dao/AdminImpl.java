package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public String closeCustomerAccount(int accNo) {
		String message="Not deleted";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("delete from customers where accountNumber=?");
			ps.setInt(1,accNo);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Customer account deleted successfully";
			}
			else {
				message="Fail to deleted account";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
		
	}

	@Override
	public List<Customer> allCustomerView() {
		List<Customer> cusList=new ArrayList<Customer>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from customers");
	
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				int accNo=rs.getInt("accountNumber");
				String accType=rs.getString("accountType");
				String fName=rs.getString("firstName");
				String lName=rs.getString("lastName");
				String gender=rs.getString("gender");
				String mobNo=rs.getString("mobileNo");
				String email=rs.getString("email");
				String userName=rs.getString("userName");
				String pass=rs.getString("password");
				double Bal=rs.getDouble("openingBalance");
				
				Customer cus = new Customer();
				
				cus.setAccountNumber(accNo);
				cus.setAccountType(accType);
				cus.setFirstName(fName);
				cus.setLastName(lName);
				cus.setGender(gender);
				cus.setMobileNo(mobNo);
				cus.setEmail(email);
				cus.setUsername(userName);
				cus.setPassword(pass);
				cus.setAccountBalance(Bal);

				cusList.add(cus);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return cusList;
	}



	@Override
	public String updateCustomerFirstName(int acc, String fname) {
		String message="Not updated";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update customers set firstName="+"'"+fname+"'"+" where accountNumber=?");
			ps.setInt(1,acc);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="First name updated successfully";
			}
			else {
				message="Fail to update first name";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}



	@Override
	public String updateCustomerLastName(int acc, String lname) {
		String message="Not updated";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update customers set lastName="+"'"+lname+"'"+"where accountNumber=?");
			ps.setInt(1,acc);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Last name updated successfully";
			}
			else {
				message="Fail to update last name";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		

		return message;
	}



	@Override
	public String updateCustomerMobileNo(int acc, String mobile) {
		String message="Not updated";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update customers set mobileNo="+"'"+mobile+"'"+"where accountNumber=?");
			ps.setInt(1,acc);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Mobile number updated successfully";
			}
			else {
				message="Fail to update mobile number";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}



	@Override
	public String updateCustomerEmail(int acc, String email) {
		String message="Not updated";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update customers set email="+"'"+email+"'"+"where accountNumber=?");
			ps.setInt(1,acc);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Email updated successfully";
			}
			else {
				message="Fail to update Email";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		return message;
	}



	@Override
	public String updateCustomerUserName(int acc, String username) {
		String message="Not updated";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update customers set userName="+"'"+username+"'"+"where accountNumber=?");
			ps.setInt(1,acc);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Username updated successfully";
			}
			else {
				message="Fail to update Username";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}



	@Override
	public String updateCustomerPassword(int acc, String password) {
		String message="Not updated";
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update customers set password="+"'"+password+"'"+"where accountNumber=?");
			ps.setInt(1,acc);
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Password updated successfully";
			}
			else {
				message="Fail to update Password";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}

}
