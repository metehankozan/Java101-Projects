package Java_Combination;
import java.util.Scanner;

public class Combination {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, comb, total_n = 1, total_r = 1, total_nr = 1;

        System.out.print("Toplam eleman sayısı: ");
        n = input.nextInt();
      
        System.out.print("Seçilecek eleman sayısı: ");
        r = input.nextInt();
            
        while(r>n){
            System.out.println("Seçilecek eleman sayısı toplam eleman sayısından küçük veya eşit olmalı!");
            System.out.print("Seçilecek eleman sayısı: ");
            r = input.nextInt();
        }
          
        for(int i = 1; i <= n; i++)
        total_n *= i;

        for(int i = 1; i <= r; i++)
        total_r *= i;

        for(int i = 1; i <= (n-r); i++)
        total_nr *= i;
    
        comb = total_n / (total_r * total_nr);

        System.out.println("Kombinasyon: "+comb);
    
        input.close();
    }
}
