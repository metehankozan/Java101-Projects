package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int number = random.nextInt(101);
        int life = 5;
        int turn = 0;
        boolean isWin = false;
        boolean isFirstTimeOutOfRange = true;
        int[] hist = new int[life];

        System.out.println("<=== OYUN BAŞLIYOR ===>");
        while(turn < life){
            System.out.println("- Doğru sayıyı tahmin etmek için " + (life-turn) + " hakkın var -");
            System.out.print("Şimdi 0-100(dahil) arası bir sayı gir: ");
            int guess = in.nextInt();
            if(guess < 0 || guess > 100){
                if(isFirstTimeOutOfRange){
                    System.out.println("Lütfen 0-100(dahil) arası bir sayı girmeye dikkat et! Aksi halde haklarını kaybedeceksin.");
                    isFirstTimeOutOfRange = false;
                }else{
                    System.out.println("Bir hakkını kaybettin! Lütfen 0-100(dahil) arası bir sayı girmeye dikkat et.");
                    turn++;
                }
                System.out.println();
                continue;
            }
            if(guess == number){
                System.out.println("Teblikler, doğru tahmin!!");
                isWin = true;
                break;
            }else{
                hist[turn] = guess;
                int diff = Math.abs(number-guess);
                System.out.print("Malesef yanlış cevap.. ");
                if(diff<3){
                    System.out.print("Ama çok yaklaştın! ");
                }
                if(guess<number){
                    System.out.println("Gelecek sefer daha büyük bir sayı dene");
                }else{
                    System.out.println("Gelecek sefer daha küçük bir sayı dene");
                }
                turn++;
                System.out.println();
            }
        }

        if(!isWin){
            int totalZeros = 0;
            System.out.println("Bu sefer olmadı ama her zaman tekrar deneyebilirsin.");
            System.out.print("Geçerli tahminlerin: ");
            for(int n: hist){
                if(n != 0) System.out.print(n + " ");
                else totalZeros++;
            }
            if(totalZeros == life) System.out.print("Geçerli bir tahmin yapmamışsın.");
            else System.out.println("şeklindeydi. Ama aradığımız sayı: " + number + " idi.");
        }

        in.close();
    }
}
