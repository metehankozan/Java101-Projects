package RecursivePrime;

public class RecursivePrime {
    public static void recursivePrime(int n){
        if(n < 2){
            System.out.println("Lütfen 1'den büyük bir sayı giriniz.");
            return;
        }
        if(isPrime(n, 2)){
            System.out.printf("%d bir asal sayıdır.", n);
        }else{
            System.out.printf("%d bir asal sayı değildir.", n);
        }
    }

    public static boolean isPrime(int n, int div){
        boolean res = false;
        if(n == div){
            return true;
        }else if(n%div == 0){
            return false;
        }
        res = isPrime(n, div+1);
        return res;
    }

    public static void main(String[] args) {
        recursivePrime(17);
    }
}
