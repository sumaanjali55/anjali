package suma;

public class Amstrongnum {

	public static void main(String[] args) {
		        int n = 23, temp = n, sum = 0, d, len = String.valueOf(n).length();
		        while (temp > 0) {
		            d = temp % 10;
		            sum += Math.pow(d, len);
		            temp /= 10;
		        }
		        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
	}

}
