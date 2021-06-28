package java_checkout;

import java.util.Scanner;

public class checkout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, 
        muzKg = 0.95, patlıcanKg = 5;

        System.out.print("Armut Kaç Kilo ? : ");
        double armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlıcan = input.nextDouble();

        input.close();

        double total = armut * armutKg + elma * elmaKg + domates * domatesKg + muz * muzKg + patlıcan * patlıcanKg;

        System.out.print("Toplam Tutar : " + total);
        
        
    }
}
