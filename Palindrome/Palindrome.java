package Palindrome;

public class Palindrome {
    public static boolean isPalindrome(String s){
        return s.equals(reverse(s));
    }

    private static String reverse(String s) {
        if(s.isEmpty()){
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }
}
