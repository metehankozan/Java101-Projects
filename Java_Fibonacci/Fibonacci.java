package Java_Fibonacci;
import java.util.Scanner;

public class Fibonacci{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayısı: ");
        int n = input.nextInt();
        int base = 0, next = 1;

        for(int i = 1; i <= n; i++){
            
            System.out.print(base+" ");
            
            int total = base + next;

            base = next;
            next = total;

        }
        input.close();
    }
}
