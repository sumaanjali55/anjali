package Exceptionhandlings;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=4;
		if(age<18)
			throw new ArithmeticException("Not Eligible");
		else
			System.out.println("Eligible");

	}

}
