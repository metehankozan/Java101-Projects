package Java_MinMax;
import java.util.Scanner;

public class MinMax{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Bu programda girdiğiniz sayıların en büyüğünü ve en küçüğünü bulacaksınız.");
      System.out.print("Sayıları giriniz: ");
      String n = input.nextLine();
      int max = Integer.parseInt(n), min = Integer.parseInt(n);

      while(!n.equals("quit")){
        System.out.print("(Bitirmek için 'quit' yazabilirsiniz.) ");
        System.out.print("Sıradaki sayı: ");
        n = input.nextLine();

        if(n.equals("quit")){
          continue;
        }
        // Girilen değeri integer'a çevirmeyi deniyoruz
        try{ 
          int i = Integer.parseInt(n);
        
          if(i > max){
            max = i;
          }
          else if(i < min){
            min = i;
        }
        }
        catch (Exception e){
          System.out.println("Geçersiz giriş!");
        }
      }

      System.out.println("En Büyük Sayı: "+max);
      System.out.print("En Küçük Sayı: "+min);

      input.close();
    }
}