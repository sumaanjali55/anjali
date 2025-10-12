package lambdaexpression;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class lambdawithoutpatameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        // Lambda with no parameter
	        Greeting greet = () -> {
	            System.out.println("Hello! Welcome to Java Lambda Expressions 😊");
	        };

	        greet.sayHello();

	}

}
