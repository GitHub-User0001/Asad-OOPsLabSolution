package com.Credentials;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
	
		String firstname;
		String lastname;
		String department= null;
		Scanner input= new Scanner(System.in);
				
		System.out.println("please enter your first name");		
		firstname = input.next();
		
		System.out.println("please enter your last name");		
		lastname = input.next();
		
		System.out.println("please select your department from the following: \n 1. Technical \n 2. Admin \n 3. Legal \n 4. HR");		
        int dep = input.nextInt();
        switch(dep) {
        case 1:
        	department = "tech";
        	break;
        case 2:
        	department = "admin";
        	break;
        case 3:
        	department = "legal";
        	break;
        case 4:
        	department = "hr";
        	break;
          }
       Employee emp = new Employee(firstname, lastname, department);
       CredentialService empCred = new CredentialService();
       empCred.generateEmailAdress(emp);
       empCred.generatePassword(emp);
       empCred.showCredentials(emp);
        
        
        
        }
	}

