package Java_AverageCalculator;
import java.util.Scanner;

public class averageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mat, fizik, turkce, kimya, muzik;

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            System.out.print("Lütfen 0-100 arasında bir not giriniz: ");
            mat = input.nextInt();
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100){
            System.out.print("Lütfen 0-100 arasında bir not giriniz: ");
            fizik = input.nextInt();
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100){
            System.out.print("Lütfen 0-100 arasında bir not giriniz: ");
            turkce = input.nextInt();
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            System.out.print("Lütfen 0-100 arasında bir not giriniz: ");
            kimya = input.nextInt();
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100){
            System.out.print("Lütfen 0-100 arasında bir not giriniz: ");
            muzik = input.nextInt();
        }

        double average = (mat+turkce+fizik+kimya+muzik) / 5.;

        System.out.println("Ortalamanız: "+average);

        if(average<=55){
            System.out.println("Maalesef kaldınız.");
        }
        else{
            System.out.println("Geçtiniz!");
        }
        
        input.close();

    }
    
}
