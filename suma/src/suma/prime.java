package suma;

public class prime {

	public static void main(String[] args) {
		        int n =30, i, f = 0;
		        if (n < 2) f = 1;
		        for (i = 2; i <= n / 2; i++)
		            if (n % i == 0) { f = 1; break; }
		        System.out.println(f == 0 ? "Prime" : "Not Prime");
	}

}
