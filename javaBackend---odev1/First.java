import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //dersleri tanımlayalım
        int mat, fzk, kim, trk, trh,muz;

        //deslerin notlarını kullanıcıdan isteyelim
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fzk = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        trk = input.nextInt();

        System.out.print("Tarih notunuz: ");
        trh = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muz = input.nextInt();

        int toplam = mat + fzk + kim + trk + trh + muz;
        double avg = toplam / 6.;

        System.out.println("Ortalamanız: " + avg);
        System.out.print(avg > 60 ? "Geçtiniz" : "Kaldınız");


    }
}
