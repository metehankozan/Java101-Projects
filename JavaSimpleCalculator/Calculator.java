package JavaSimpleCalculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,operator;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk değer: ");
        a = input.nextInt();

        System.out.print("İkinci değer: ");
        b = input.nextInt();

        System.out.println("İşlem seçiniz:");
        System.out.println("1 - Toplama \n2 - Çıkarma \n3 - Çarpma \n4 - Bölme");

        operator = input.nextInt();

        input.close();

        switch(operator){
            case 1:
            System.out.println("Sonuç: "+(a+b));
            break;

            case 2:
            System.out.println("Sonuç: "+(a-b));
            break;

            case 3:
            System.out.println("Sonuç: "+(a*b));
            break;

            case 4:
            if (b != 0){
                System.out.println("Sonuç: "+(a/b));
            }else{
                System.out.println("0'a bölünemez");
            }
            break;

            default:
            System.out.println("Tanımsız işlem");

        }

        

    }
}
