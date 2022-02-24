package RecursiveExponential;

import java.util.Scanner;

public class RecursiveExponential {
    public static void recExp(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değer: ");
        int base = scan.nextInt();
        System.out.print("Üs değer: ");
        int exponent = scan.nextInt();

        System.out.println("Sonuç: " + recExpResult(base, exponent));

        scan.close();
    }

    public static double recExpResult(double base, int exponent){
        if(exponent == 0){
            return 1;
        }
        if(exponent<0){
            base = 1/base;
            exponent *= -1;
        }

        return base * recExpResult(base,exponent-1);
    }

    public static void main(String[] args) {
        recExp();
    }
}
