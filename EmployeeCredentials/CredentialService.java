package com.Credentials;
import java.util.Random;

public class CredentialService {
	public char[] generatePassword(Employee employee) {
		
		String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^&*()0123456789abcdefghijklmnopqrstuvwxyz";
		int length = 10;
		Random random = new Random();
		char[] password = new char[10];
		
		for(int i=0;i<length;i++) {
			password[i]=pattern.charAt(random.nextInt(pattern.length()));
			}
		employee.setPassword(password);
		return password;
		
		
	}
	
public String generateEmailAdress(Employee employee) {
	
	String company = "hitec.com";
	String email = employee.getFirstname()+employee.getLastname()+"@"+employee.getDepartment()+company;
	employee.setEmail(email);
	return email;
}

public void showCredentials(Employee employee) {
	
	System.out.println("Dear "+ employee.getFirstname()+" your generated credenials are as follows: ");		
	System.out.println("email: "+employee.getEmail());
	System.out.println("Password: "+ employee.getPassword().toString());
	
}

}
