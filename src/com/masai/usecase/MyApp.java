package com.masai.usecase;

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
		
		
		
		try {
			Scanner sc=new Scanner(System.in);
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
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
