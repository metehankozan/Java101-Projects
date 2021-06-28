package Java_ExponentialNums;
import java.util.Scanner;

public class Exponential {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int b, n, total = 1;

        System.out.print("Taban: ");
        b = input.nextInt();

        System.out.print("Üs: ");
        n = input.nextInt();

        for(int i=1; i <= n; i++){
            total *= b;
        }

        System.out.println("Sonuç: " + total);

        input.close();
    }
}
