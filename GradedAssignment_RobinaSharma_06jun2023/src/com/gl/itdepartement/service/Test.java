package com.gl.itdepartement.service;

import java.util.Random;


public class Test {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Random r = new Random();   //press ctrl+shift+o for import
//		
//		System.out.println(r.nextFloat());  //Generate decimal values
//		
//		System.out.println(r.nextInt(8));
//		
//		
//		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		
//		System.out.println(capitalLetters.charAt(5));  // Output in console have index F because starts from 0
//		
//
//	}
	
	//Scenario 2: 
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();   //press ctrl+shift+o for import
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = ("!@#$%^&*_=+-/.?<>");
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		System.out.println(values.length());
		System.out.println(r.nextInt(values.length()));
		System.out.println(values.charAt(r.nextInt(values.length())));
		
		
		
		
		
	
		

	}

}
