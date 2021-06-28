package Java_PrimeNumber;

public class PrimeNumber {
    
    public static void main(String[] args) {
        System.out.print("Asal Sayılar: ");
        for(int i = 1; i <= 100; i++){
            for(int k = 2; k <= i; k++){
                if(k == i){
                    System.out.printf("%d ",i);
                }
                else if(i%k == 0){
                    break;
                }
            }
        }
    }
}
