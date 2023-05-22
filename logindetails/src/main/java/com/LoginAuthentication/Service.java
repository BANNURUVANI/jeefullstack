package com.LoginAuthentication;

public interface Service {
	boolean verifyUser(String userName)throws UserNameNotValidException ; 

	 

    boolean verifyPassword(String password) throws PasswordNotValidException; 

 

} 

