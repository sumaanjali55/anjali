package com.tnsifset;

abstract class Shape {
 abstract void draw();

 void display() {
     System.out.println("This is a shape.");
 }
}

class Circle extends Shape {
 void draw() {
     System.out.println("Drawing a Circle.");
 }
}
class Rectangle extends Shape {
 void draw() {
     System.out.println("Drawing a Rectangle.");
 }
}
public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Shape s1 = new Circle();  
	        s1.display();
	        s1.draw();

	        Shape s2 = new Rectangle();
	        s2.display();
	        s2.draw();
	}

}
