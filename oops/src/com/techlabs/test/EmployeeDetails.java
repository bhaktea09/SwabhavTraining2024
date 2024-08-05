package com.techlabs.test;

public class EmployeeDetails {

    public static void main(String[] args) {
        // Create an instance of Employee
        EmployeeDetails employee = new EmployeeDetails();
        employee.setEmployeeId(1);
        employee.setName("BHAKTI");
        employee.setSalary(50000);
        

        System.out.println("Details of Employee 1:");
        employee.displayDetails();
    }
}
