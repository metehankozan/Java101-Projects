package Java_SumOfDigits;
import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, num, digit;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        while(num > 0){
            digit = num % 10; // son basamağı alıyoruz
            total += digit;  

            num /= 10; //son basamağı atıyoruz
        }

        System.out.println("Basamakların toplamı: "+total);

        input.close();
    }
}
