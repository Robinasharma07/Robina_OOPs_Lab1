package com.gl.itdepartement.service;

import java.util.Random;

import com.gl.itdepartement.model.Employee;

public class EmailCredentialServiceImp  implements EmailCredentialService{

	@Override
	public String generateEmailAddress(Employee emp, String departement) {
		// TODO Auto-generated method stub
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + departement + "gl.com";
	}

	@Override
	public String generatepassword() {
		// TODO Auto-generated method stub
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = ("!@#$%^&*_=+-/.?<>");
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();   // It display error first import Random by press ctrl+shift+O
		
		String password = "";
		
		for (int i= 0;i<8; i++) {   // value range 0 to 8
			password +=	values.charAt(random.nextInt(values.length()));
			
			/* += is assignment operator : compound
			* create random no from string values  have 80, see program in test for more details
			* chart at store at password and select random number and whatever the characters view store at password
			*/
		}
			return password;
		
		
	}

	@Override
	public void showCredentials(Employee emp, String departement) {
		
		System.out.println("Dear " + emp.getFirstName() + " " +emp.getLastName()+" your generated credentials are as follows:");
		System.out.println("Your Email Id: "+ generateEmailAddress(emp, departement));
		System.out.println("Your Password: " + generatepassword());
		
		
	}

}
