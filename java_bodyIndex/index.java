package java_bodyIndex;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, height, idx;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        weight = input.nextDouble();

        input.close();

        idx = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz :"+idx);

    }
}
