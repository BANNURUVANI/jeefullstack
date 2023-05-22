package com.LoginAuthentication; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class LoginValidation implements Service { 
public boolean verifyUser(String userName) throws UserNameNotValidException { 

        Pattern p = Pattern.compile("[A-Z][a-zA-Z]{5,10}"); 

        Matcher matcher = p.matcher(userName); 

        if (matcher.find()) { 

            return true; 

        } 

        throw new UserNameNotValidException("UserName is not valid"); 

    } 

public boolean verifyPassword(String password) throws PasswordNotValidException { 

Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&]){8,20}"); 

        Matcher matcher = p.matcher(password); 

        if (matcher.find()) { 

            return true; 

        } 

        throw new PasswordNotValidException(" password is not valid"); 

    } 

} 
