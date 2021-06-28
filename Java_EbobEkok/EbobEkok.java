package Java_EbobEkok;
import java.util.Scanner;

public class EbobEkok {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayı: ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayı: ");
        int n2 = input.nextInt();

        int holder;

        // n1'in n2'den büyük olması durumunda değerleri yer değiştiriyoruz.
        if(n1 > n2){
            holder = n1;
            n1 = n2;
            n2 = holder;
        }

        int i = n1, ebob = 1;

        while(i > 0){
            if(n1%i == 0 && n2%i == 0){
                ebob = i;
                break;
            }
            i--;
        }
        System.out.print("Ebob: ");
        System.out.println(ebob);

        int k = n2,ekok = n1*n2;

        while(k < (n1*n2)){
            if(k%n1 == 0 ){
                ekok = k;
                break;
            }
            k += n2;
        }
        System.out.print("Ekok: ");
        System.out.println(ekok);

        input.close();
    }
}
