package PalindromeNumber;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }

    public static boolean isPalindrom(int n){
        return n == reverse(n);
    }

    public static int reverse(int n){
        int reverse = 0, last;
        while(n != 0){
            last = n % 10;
            reverse = (reverse * 10) + last;
            n /= 10;
        }
        return reverse;
    }
}
