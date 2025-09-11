package suma;

public class typeconverstion {

	public static void main(String[] args) {
		        // Implicit (Widening)
		        int x = 10;
		        double y = x;  
		        System.out.println("Implicit: int to double = " + y);

		        // Explicit (Narrowing)
		        double a = 9.78;
		        int b = (int) a;  
		        System.out.println("Explicit: double to int = " + b);

	}

}
