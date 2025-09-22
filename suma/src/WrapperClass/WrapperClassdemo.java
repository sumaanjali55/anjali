package WrapperClass;

public class WrapperClassdemo {

	public static void main(String[] args) {
		        int a = 10;
		        double b = 20.5;
		        char c = 'X';
		        boolean d=true;
		        Integer objA = a;
		        Double objB = b;
		        Character objC = c;
		        Boolean objD = d;

		        System.out.println("Autoboxing:");
		        System.out.println("Integer object: " + objA);
		        System.out.println("Double object: " + objB);
		        System.out.println("Character object: " + objC);
		        System.out.println("Boolean object: " + objD);

		        int x = objA;
		        double y = objB;
		        char z = objC;
		        boolean w = objD;

		        System.out.println("\nUnboxing:");
		        System.out.println("int value: " + x);
		        System.out.println("double value: " + y);
		        System.out.println("char value: " + z);
		        System.out.println("boolean value: " + w);
	}

}
