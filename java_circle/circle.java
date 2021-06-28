package java_circle;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, alan, a;

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açısını giriniz: ");
        a = input.nextDouble();

        input.close();

        alan = Math.PI * r * r * a / 360;

        System.out.print("Alan: "+alan);
    }
    
}
