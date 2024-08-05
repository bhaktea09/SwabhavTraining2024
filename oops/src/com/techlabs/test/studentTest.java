package com.techlabs.test;
import java.util.*;
import com.techlabs.model.*;
public class studentTest{

	public static void main(String[] args) {
			  student student1 = new student();
			  Scanner sc = new Scanner(System.in);

			  System.out.println("Enter rollnumber");
			  int rollnumber = sc.nextInt();
			  student1.setrollnumber(rollnumber);

			  System.out.println("Enter name");
			  String name = sc.next();
			  student1.setname(name);
			  
			  System.out.println("Enter age");
			  int age = sc.nextInt();
			  student1.setage(age);
			  
			  System.out.println("Enter percentage");
			  int percentage = sc.nextInt();
			  student1.setpercentage(percentage);

			  System.out.println();

	}

}
