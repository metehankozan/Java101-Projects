package Java_ChineseZodiac;
import java.util.Scanner;

public class CineseZodiac {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthDate, remainder;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğum Yılınızı Giriniz : ");
        birthDate = input.nextInt();

        if(birthDate < 0){
            System.out.print("Lütfen pozitif bir değer giriniz: ");
            birthDate = input.nextInt();
        }

        remainder = birthDate % 12;

        switch(remainder){
            case 0:
            burc = "Maymun";
            break;

            case 1:
            burc = "Horoz";
            break;

            case 2:
            burc = "Köpek";
            break;

            case 3:
            burc = "Domuz";
            break;

            case 4:
            burc = "Fare";
            break;

            case 5:
            burc = "Öküz";
            break;

            case 6:
            burc = "Kaplan";
            break;

            case 7:
            burc = "Tavşan";
            break;

            case 8:
            burc = "Ejderha";
            break;

            case 9:
            burc = "Yılan";
            break;

            case 10:
            burc = "At";
            break;

            case 11:
            burc = "Koyun";
            break;

            default:
            isError = true;
  
        }

        if(isError)
        System.out.println("Hatalı değer girdiniz!");

        else
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
        
        input.close();

    }
}
