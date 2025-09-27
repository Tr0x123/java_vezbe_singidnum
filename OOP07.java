package oop07;

import java.util.Scanner;

public class OOP07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj1 = s.nextInt();
        System.out.print("Unesite broj: ");
        int broj2 = s.nextInt();
        System.out.print("Unesite broj: ");
        int broj3 = s.nextInt();
        System.out.print("Unesite broj: ");
        int broj4 = s.nextInt();
        System.out.print("Unesite broj: ");
        int broj5 = s.nextInt();
        
        System.out.println("");
        System.out.println("");
        
        int[] brojevi = {broj1, broj2, broj3, broj4, broj5};
        int max = brojevi[0];
        int min = brojevi[0];
        
        for (int i = 1; i < brojevi.length; i++) {
            max = Math.max(max, brojevi[i]);
            min = Math.min(min, brojevi[i]);
        }
        
        System.out.println("Najveci broj je " + max);
        System.out.println("Najmanji broj je " + min);        
        
    }
    
}
