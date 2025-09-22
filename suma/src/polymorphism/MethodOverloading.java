package polymorphism;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculator calc = new Calculator();

	        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
	        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
	        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
	}

}
