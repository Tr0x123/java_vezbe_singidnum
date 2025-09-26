package oop01;

import java.util.*;

public class OOP01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite prvu ocenu: ");
        int ocena1 = s.nextInt();
        
        System.out.print("Unesite drugu ocenu: ");
        int ocena2 = s.nextInt();
        
        System.out.print("Unesite trecu ocenu: ");
        int ocena3 = s.nextInt();
        
        double prosek = (ocena1 + ocena2 + ocena3) / 3.0;
        
        if (prosek < 2) {
            System.out.println("Nedovoljan uspeh");
        } else if (prosek < 3.5) {
            System.out.println("Dobar uspeh");
        } else if (prosek < 4.5) {
            System.out.println("Vrlo dobar uspeh");
        } else {
            System.out.println("Odlican uspeh!");
        }
        
        System.out.printf("Prosek je: %.2f\n", prosek);
    }
}
