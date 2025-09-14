package suma;

public class palindrome {
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }
	public static void main(String[] args) {
		        int n = 34;
		        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
	}

}	
