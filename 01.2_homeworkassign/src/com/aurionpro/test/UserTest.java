package com.aurionpro.test;
import java.util.*;
import com.aurionpro.model.*;
import com.aurionpro.exceptions.*;

public class UserTest{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" enter email :");
		String email = scanner.next();
		
		System.out.println(" enter password");
		String password = scanner.next();
		
		try {
            User user = new User(email, password);
            System.out.println("User created successfully:");
            System.out.println("Email: " + user.getEmail());
            System.out.println("Password: " + user.getPassword());
        } catch (EmailNotValidException e) {
            System.out.println("Invalid email: " + e.getMessage());
        } catch (PasswordNotValidException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
	}
}