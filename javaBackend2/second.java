package javaBackend2;

import java.util.Scanner;

public class second{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        double amaunt = input.nextDouble();

        input.close();
        
        double kdvRate = amaunt>1000 ? 0.08 : 0.18;

        double kdv = amaunt * kdvRate;

        double total = amaunt + kdv;
        
        System.out.println("KDV tutarı: "+kdv);
        System.out.println("Toplam tutar: "+total);
        

    }
}