package com.sumaassignment.utilities;
import com.sumaassignment.employes.Manager;
import com.sumaassignment.employes.Developer;
import com.sumaassignment.utilities.Employeeutilities;

public class AssinmentMain {
	public static void main(String[] args) {
		        // Create Manager and Developer objects
		        Manager m = new Manager("Alice", 101, 80000, "HR");
		        Developer d = new Developer("Bob", 102, 60000, "Java");

		        // Use EmployeeUtilities
		        Employeeutilities util = new Employeeutilities();

		        System.out.println("=== Manager Info ===");
		        util.displayEmployeeInfo(m);
		        System.out.println("Department: " + m.getDepartment());

		        System.out.println("\n=== Developer Info ===");
		        util.displayEmployeeInfo(d);
		        System.out.println("Programming Language: " + d.getProgrammingLanguage());
		    }
		}

