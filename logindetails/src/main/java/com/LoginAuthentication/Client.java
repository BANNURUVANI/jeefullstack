package com.LoginAuthentication;

import java.util.Scanner; 

public class Client { 

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in); 
		LoginValidation isValid = new LoginValidation(); 

		try { 

			System.out.println("enter the Name"); 
			String name = sc.next(); 

			isValid.verifyUser(name); 
			System.out.println("enter your password"); 

			String password = sc.next(); 
			System.out.println(name); 

            isValid.verifyPassword(password); 
            System.out.println(password); 

        } catch (UserNameNotValidException e) { 

        	System.out.println(e.getMessage()); 

        } 
		catch (PasswordNotValidException e) { 
			System.out.println(e.getMessage()); 

 

        } 

 

    } 

 

} 