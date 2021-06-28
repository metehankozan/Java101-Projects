package Java_PerfectNumber;
import java.util.Scanner;

public class PerfectNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        do{
            int total = 0;
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            
            for(int i=1; i<n; i++){
                if(n%i == 0){
                    total += i;
                }
            }
                
            if(total == n){
                System.out.println(n+" mükemmel sayıdır.");
            }
            else{
                System.out.println(n+" mükemmel sayı değildir.");
            }
            
        }while(n>0);

        input.close();
    }
}
