package com.gl.itdepartement.main;

import java.util.Scanner;

import com.gl.itdepartement.model.Employee;
import com.gl.itdepartement.service.EmailCredentialService;
import com.gl.itdepartement.service.EmailCredentialServiceImp;

public class EmailApp {
	public static void main(String[] args) {
		EmailCredentialService service = new EmailCredentialServiceImp (); // Create object for implementation class so as to access methods in inteface
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your  First name");
		String fn= sc.next();
		
		System.out.println("Enter your Last name");
		String ln= sc.next();
		
		Employee emp = new Employee (fn, ln);
		
		System.out.println("Please enter the Departement from following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		String departement = "";
		int option = sc.nextInt();
		switch (option) {
		
		case 1: 
			departement = "Technical";
			break;
			
		
		case 2: 
			departement = "Admin";
			break;
		
		
		case 3: 
			departement = "Human Resource";
			break;
		
		
		case 4: 
			departement = "Legal";
			break;
		
			default:
				System.out.println("PLease enter valid option");
				break;
				
			}
		// The following statements are there to check either it runs or not
//			System.out.println(emp.getFirstName());
//			System.out.println(emp.getLastName());
//			System.out.println(departement);
		
		String generatepassword =service.generatepassword();
		String generateEmailAddress =service.generateEmailAddress(emp, departement);
		service.showCredentials(emp, departement);
		 
		 sc.close();
				
		
		
		
		
		}
		
		
	}
	
	
	
	

