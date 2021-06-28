package java_alanHesaplama;

import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, u, alan;
        
        System.out.print("ilk kenar: ");
        a = input.nextDouble();

        System.out.print("ikinci kenar: ");
        b = input.nextDouble();

        System.out.print("üçüncü kenar: ");
        c = input.nextDouble();

        input.close();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Alan: "+alan);
    }
    
}
