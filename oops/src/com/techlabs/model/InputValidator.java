package com.techlabs.model;

import java.util.Scanner;

public class InputValidator {
	 private String username;
	    private String password;
	    private String email;
		public InputValidator(String username, String password, String email) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
		}
	    
		 public String getusername() {
		        return username;
		    }
		    public void setusername(String username) {
		        this.username = username;
		    }

		    
		    public String getpassword() {
		        return password;
		    }
		    public void setpassword(String password) {
		        this.password = password;
		    }
		    
		    
		    public String getemail() {
		        return email;
		    }
		    public void setemail(String email) {
		        this.email = email;
		    }
		    public static boolean validateusername(String username , Scanner scanner) {
		    	if (username != null || username.length() >3 || username.length() <20 )
		    	 {
		    		System.out.println("username :" +username);
		    				return true;
		    			}
		    	return false;
		    	}
		    	
		    	public static boolean validatepassword(String password , Scanner scanner) {
		    	if (password != null || password.length() >8|| password.length() <20 )
		    	 {
		    		System.out.println("password :" +password);
		    				return true;
		    			}
		    	return false;
		    	}
		    	
		    	public static boolean validateemail(String email , Scanner scanner) {
		    	if (email != null || email.length() >5 || email.length() < 50|| ! email.contains("@") || !email.contains(" . ") )
		    	{
		    		System.out.println("email :" +email);
		    		return true;
		    	}
		    	return false;
		    	}
		    
}
