package Java_LeapYear;
import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year,remainder;
        boolean isLeapYear = false;

        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        remainder = year % 4;

        if(remainder == 0){
            isLeapYear = true;

            if((year % 100) == 0){
                if((year % 400) != 0)
                isLeapYear = false;
            }
        }

        if(isLeapYear)
        System.out.println(year + " bir artık yıldır !");
        else
        System.out.println(year + " bir artık yıl değildir !");

        input.close();

    }
}
