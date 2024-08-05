package com.aurionpro.test;

import java.util.Scanner;

public class assignmentoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter initial value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value to add: ");
        int y = sc.nextInt();
        
		//equalto
		x=y;
		System.out.println(x);
		
		//compound 
		//a=a+b ---> +=
		x+=y;
		System.out.println("x after addition :" +x);
		
		//shorthand
		//a=a-b ----> -=
		x-=y;
		System.out.println("x after subtraction :" +x);
		
		//a=a*b ----> *=
		x*=y;
		System.out.println("x after multiplication :" +x);

	}

}
