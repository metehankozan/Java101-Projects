package Java_PlaneTicket;
import java.util.Scanner;

public class PlaneTicket {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dist, age, type;
        double perKm = .10, ageDiscount = 0, typeDiscount = 0, total;

        System.out.print("Mesafeyi (km türünden) giriniz: ");
        dist = input.nextInt();

        if(dist<0){
            System.out.print("Lütfen pozitif bir değer giriniz: ");
            dist = input.nextInt();
        }

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        if(age<0){
            System.out.print("Lütfen pozitif bir değer giriniz: ");
            age = input.nextInt();
        }  
        
        // yaş indirimi seçimi
        if(age<12)
        ageDiscount = .50;
        else if(age<25)
        ageDiscount = .10;
        else if(age>65)
        ageDiscount = .30;

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();
        System.out.println(type);

        if(type<0 || type>2){
            System.out.print("Lütfen 1 yada 2 değerini giriniz: ");
            type = input.nextInt();
        }

        if(type == 2)
        typeDiscount = .20;

        if(dist < 0 || age < 0 || type < 0 || type > 2)
        System.out.println("Hatalı giriş!");

        else{
            total = dist * perKm;
            total -= total * ageDiscount;
            if(type == 2){
                total -= total * typeDiscount;
                total *= 2;
            }
            
            System.out.println("Toplam tutar: " + total);
        }

        input.close();

    }
}
