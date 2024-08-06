package com.aurionpro.model;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number1:");
        int a = sc.nextInt();
        
        System.out.println("Enter number2:");
        int b = sc.nextInt();
        
        System.out.println("Enter number3:");
        int c = sc.nextInt();
        
        System.out.println("Enter number4:");
        int d = sc.nextInt();
        
        int sum = add(c, d);
        System.out.println("Addition is: " + sum);
        
        int sub = sub(a, b);
        System.out.println("Subtraction is: " + sub);
        
        int mul = mul(c, d);
        System.out.println("Multiplication is: " + mul);
        
        int div = div(a, b);
        System.out.println("Division is: " + div);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }

    // Method to add two numbers
    private static int add(int c, int d) {
        return c + d;
    }

    // Method to subtract two numbers
    private static int sub(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    private static int mul(int c, int d) {
        return c * d;
    }

    // Method to divide two numbers
    private static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b;
    }
}
