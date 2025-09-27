package oop10;

import java.util.Scanner;

public class OOP10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite duzinu stranice a: ");
        double stranicaA = s.nextDouble();
        
        System.out.print("Unesite duzinu stranice b: ");
        double stranicaB = s.nextDouble();
        
        double obim = 2 * (stranicaA + stranicaB);
        double povrsina = stranicaA * stranicaB;
        
        System.out.printf("Obim pravougaonika je: %.2f\n", obim);
        System.out.printf("Povrsina pravougaonika je: %.2f\n", povrsina);
    }
}
