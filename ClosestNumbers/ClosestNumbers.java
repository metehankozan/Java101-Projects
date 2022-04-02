package ClosestNumbers;

import java.util.Scanner;

public class ClosestNumbers {

    static void findClosestNumbers(int[] arr, int number){
        int smallerDistance = Integer.MAX_VALUE;
        int biggerDistance = Integer.MAX_VALUE;
        int smaller = arr[0];
        int bigger = arr[0];
        int numberOfBigger = 0;
        int numberOfSmaller = 0;

        for(int elem: arr){
            if(elem<number && Math.abs(number-elem)<smallerDistance){
                smallerDistance = Math.abs(number-elem);
                smaller = elem;
                numberOfSmaller++;
            }else if(elem>number && Math.abs(number-elem)<biggerDistance){
                biggerDistance = Math.abs(number-elem);
                bigger = elem;
                numberOfBigger++;
            }
            
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (numberOfSmaller != 0 ? smaller : 
        "-"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (numberOfBigger != 0 ? bigger : "-"));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hangi sayının array içerisindeki en yakın değerlerini bulmak istersiniz? => ");
        int number = in.nextInt();
        
        int[] arr = {15,12,788,1,-1,-778,2,0};
        
        findClosestNumbers(arr, number);

        in.close();
    }
}
