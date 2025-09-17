package com.sumaassignment.utilities;

import com.sumaassignment.employes.Employee;
/**
 * utility class for Employee operations
 */

public class Employeeutilities {
	    // Method to display employee details
	    public void displayEmployeeInfo(Employee e) {
	        System.out.println("Employee ID: " + e.getEmployeeId());
	        System.out.println("Name: " + e.getName());
	        System.out.println("Salary: " + e.getSalary());
	    }
	}
