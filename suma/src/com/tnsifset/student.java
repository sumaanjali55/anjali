package com.tnsifset;

public class student {
	    // private variables (data hiding)
	    private String name;
	    private int age;

	    // Setter for name
	    public void setName(String n) {
	        name = n;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for age
	    public void setAge(int a) {
	        if (a > 0) {   // validation example
	            age = a;
	        } else {
	            System.out.println("Age must be positive!");
	        }
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }
	    
	public static void main(String[] args) {
	 student s = new student();

    // using setters
    s.setName("suma");
    s.setAge(20);

    // using getters
    System.out.println("Student Name: " + s.getName());
    System.out.println("Student Age: " + s.getAge());

	}

}
