package Java_EventRecommendation;
import java.util.Scanner;

public class Recommendations {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        System.out.println("Yapabileceğiniz etkinlikler: ");

        if(heat < 5){
            System.out.println("Kayak");
        }

        else if(heat < 10){
            System.out.println("Sinema");
        }

        else if(heat < 15){
            System.out.println("Sinema ve Piknik");
        }

        else if(heat < 25){
            System.out.println("Piknik");
        }

        else{
            System.out.println("Yüzme");
        }
        
        input.close();
    }
}
