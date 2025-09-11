package suma;

public class operators {

	public static void main(String[] args) {
		        int a = 5, b = 11;
		        
		        System.out.println("a+b=" + (a+b));
		        System.out.println("a-b=" + (a-b));
		        System.out.println("a>b? " + (a>b));
		        System.out.println("a>5 && b<10? " + (a>5 && b<10));
		        a += b;
		        System.out.println("a+=b -> " + a);
		        System.out.println("++b=" + (++b));
		        System.out.println("Max=" + (a>b ? a : b));
	}

}
