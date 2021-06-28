package java_taksimetreHesaplama;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dist, charge = 2.20, total = 10;

        System.out.print("Mesafeyi giriniz: ");
        dist = input.nextDouble();

        input.close();

        total += dist * charge;

        total = (total < 20) ? 20 : total;

        System.out.print("Tutar: "+total);

    }
    
}
