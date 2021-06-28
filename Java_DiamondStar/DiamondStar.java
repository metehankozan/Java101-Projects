package Java_DiamondStar;
import java.util.Scanner;

public class DiamondStar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.print("Basamak sayısı: ");
      int n = input.nextInt();

      // Basamak sayısının çift yahut tek olmasına göre iki olasılık bulunuyor

      if(n%2 == 0){
        n = n / 2;

        for(int i = 1; i <= n; i++){

          for(int k = 1; k <= (n-i); k++){
            System.out.print(" ");
          }
          
          for(int j = 1; j <= (2*i)-1; j++){
            System.out.print("*");
          }
          System.out.println();
        }
  
        for(int i = n; i >= 1; i--){
  
          for (int j = (n-1); j >= i; j--){
            System.out.print(" ");
          }
  
          for(int k = 1; k <= (2*i)-1; k++){
            System.out.print("*");
          }
          System.out.println();
        }
      }

      else{
        n = n / 2 + 1;

        for(int i = 1; i <= n; i++){

          for(int k = 1; k <= (n-i); k++){
            System.out.print(" ");
          }
          
          for(int j = 1; j <= (2*i)-1; j++){
            System.out.print("*");
          }
          System.out.println();
        }
  
        for(int i = (n-1); i >= 1; i--){
  
          for (int j = (n-1); j >= i; j--){
            System.out.print(" ");
          }
  
          for(int k = 1; k <= (2*i)-1; k++){
            System.out.print("*");
          }
          System.out.println();
        }
      }

      input.close();
    }
}
