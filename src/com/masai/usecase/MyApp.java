package com.masai.usecase;



import java.util.List;
import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminImpl;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerImpl;
import com.masai.model.Customer;

public class MyApp {
	

import java.util.Scanner;

public class MyApp {


	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("**  Welcome To Online Banking System  **");
		System.out.println("----------------------------------------");
		System.out.println("1.Admin Login");
		System.out.println("2.Customer Login");
		System.out.println("3.New Customer ? Register here");
		System.out.println("4.Forget Id / Password");
		System.out.println("5.Exit");
		

		CustomerDao dao=new CustomerImpl();
		AdminDao adminDao=new AdminImpl();

		
		try {
			Scanner sc=new Scanner(System.in);
			int choice =sc.nextInt();
			switch(choice) {
			case 1:

				System.out.println("Enter User Name");
				String lauser=sc.next();
				System.out.println("Enter Password");
				String lapass=sc.next();
				
				if(lauser.equals("yash") && lapass.equals("12345")) {
					System.out.println("");
					System.out.println("***********Login successfull***********");
					System.out.println("");
					
					System.out.println("1.View customer details with account number");
					System.out.println("2.Update customer details");
					System.out.println("3.Close customer account");
					System.out.println("4.View all customer of bank");
					System.out.println("5.Exit");
					
					System.out.println("");
					System.out.println("*******************************************");
					System.out.println("");
					
					try {
						int choiceOption =sc.nextInt();
						switch(choiceOption) {
						
						case 1:
							System.out.println("Enter customer account no");
							int accountNumber=sc.nextInt();
							Customer customer=adminDao.customerDetails(accountNumber);
							

							System.out.println("***********************");
							System.out.println(customer.getFirstName());
							System.out.println(customer.getLastName());
							System.out.println(customer.getGender());
							System.out.println(customer.getMobileNo());
							System.out.println(customer.getEmail());
							System.out.println(customer.getUsername());
							System.out.println(customer.getAccountType());
							System.out.println(customer.getAccountBalance());
							
							break;
							
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							System.out.println("Thank you and Visit Again");
							break;
						default:
							System.out.println("Invalid input");
							break;
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					
					
				}
				else {
					System.out.println("Invaid user or password");
				}
				
				break;
			case 2:
				try {
					System.out.println("Enter User Name");
					String luser=sc.next();
					System.out.println("Enter Password");
					String lpass=sc.next();
					
					Customer currentUser= dao.provideUserObject(luser);
					
					if(currentUser.getUsername().equals(luser) && currentUser.getPassword().equals(lpass)) {
						System.out.println("");
						
						System.out.println("***********Login successfull***********");
						System.out.println("1.Check balance");
						System.out.println("2.View last 5 Transactions");
						System.out.println("3.View all Transactions");
						System.out.println("4.View financial account statements online");
						System.out.println("5.Account-to-Account transfer");
						System.out.println("6.ATM & Bank Locator");
						System.out.println("7.Exit");
						
						System.out.println("");
						System.out.println("*******************************************");
						System.out.println("");
						
						try {
							
							int choiceCus =sc.nextInt();
							switch(choiceCus) {
							case 1:
								System.out.println("Your current balance is "+currentUser.getAccountBalance());
								break;
							case 2: 
								List<String> li=dao.view_Last_5_Transactions(currentUser);
								li.forEach(str->System.out.println(str));
								break;
							case 3:
								break;
							case 4:
								break;
							case 5:
								System.out.println("Enter account no to transfer");
								int TransferAcc=sc.nextInt();
								System.out.println("Enter Amount");
								double amount=sc.nextDouble();
								String message=dao.fundTransefer(currentUser,TransferAcc,amount);
								System.out.println(message);
								break;
							case 6:
								break;
							case 7:
								System.out.println("Thank you and Visit Again");
								break;
							default :
								System.out.println("Invalid input");
								break;
							}
							
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
					else {
						System.out.println("Invaid user or password");
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		
				break;
		    case 3:
		    	System.out.println("Enter your first name ");
		    	String fname=sc.next();
		    	System.out.println("Enter your last name ");
		    	String lname=sc.next();
		    	System.out.println("Enter your gender ");
		    	String gender=sc.next();
		    	System.out.println("Enter your mobile no ");
		    	String mobile=sc.next();
		    	System.out.println("Enter your email ");
		    	String email=sc.next();
		    	System.out.println("Enter your username ");
		    	String user=sc.next();
		    	System.out.println("Enter password ");
		    	String pass=sc.next();
		    	System.out.println("Enter opening balance ");
		    	Double balance=sc.nextDouble();
		    	System.out.println("Enter Account type ");
		    	String acc=sc.next();
		    	
		    	Customer customer=new Customer(fname, lname, gender, mobile,email,user, pass,acc,balance);
		    	String message=dao.customerRegistration(customer);
		    	System.out.println(message);

				break;
			case 2:
				break;
		    case 3:

		    	break;
	        case 4:
	        	break;
            case 5:
            	break;
            default :
            	break; 
            }
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
