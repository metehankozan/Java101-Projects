package Java_ReverseStar;
import java.util.Scanner;

public class ReverseStar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int n = input.nextInt();

        for(int i = n; i > 0; i--){
            for(int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
