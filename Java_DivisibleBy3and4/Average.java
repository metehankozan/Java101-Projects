package Java_DivisibleBy3and4;
import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, k, counter = 0, total = 0;
        double avg;

        System.out.print("Bir limit giriniz: ");
        k = input.nextInt();

        while(i<=k){
            if((i%3==0) && (i%4==0)){
                total += i;
                counter += 1;
            }

            i++;
        }

        avg = total / counter;

        System.out.print("3'e ve 4'e bölünen sayıların ortalaması: " + avg);

        input.close();
    }
}
