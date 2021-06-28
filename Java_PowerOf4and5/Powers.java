package Java_PowerOf4and5;
import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Limit giriniz: ");
        n = input.nextInt();

        System.out.printf("%-10d%d%n",4,5);
        System.out.println("-----------");

        for(int i=1, j=1; i<n || j<n; i*=4, j*=5){
            System.out.printf("%-10d",i);
            if(j<n)
            System.out.println(j);
        }

        input.close();
    }
}
