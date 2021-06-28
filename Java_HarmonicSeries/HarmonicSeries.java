package Java_HarmonicSeries;
import java.util.Scanner;

public class HarmonicSeries {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();
        
        double result = 0;

        while(n > 0){
            result += 1.0 / n;
            n--;
        }

        System.out.println("Sonuç: "+result);

        input.close();
    }
}
