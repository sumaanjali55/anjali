package Exceptionhandlings;

public class multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println(s.length());	
		}catch(ArithmeticException e) {
			System.out.println("Division by zero not possible");
		}
		catch(NullPointerException e) {
			System.out.println("The null values can't be read");
		}
         catch(ArrayIndexOutOfBoundsException e) {
        	    System.out.println("Index not found");
		}
	}

}
