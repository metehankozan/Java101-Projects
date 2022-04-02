package SortArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    static int[] sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            int smallest = arr[i];
            int place = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<smallest){
                    smallest = arr[j];
                    place = j;
                }
            }
            int holder = arr[i];
            arr[i] = smallest;
            arr[place] = holder;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz!");
        for(int i=0; i<arr.length; i++){
            System.out.print(i+1 + ". Eleman: ");
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(sortArray(arr)));

        in.close();
    }
}
