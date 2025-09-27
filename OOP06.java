package oop06;

import java.util.Scanner;

public class OOP06 {
    public static void main(String[] args) {
        System.out.println("NAJVECI BROJ !");
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("");
        
        Scanner b = new Scanner(System.in);
        
        System.out.println("Unesite prvi broj: ");
        int prviBroj = b.nextInt();
        
        System.out.println("Unesite drugi broj: ");
        int drugiBroj = b.nextInt();
        
        System.out.println("Unesite treci broj: ");
        int treciBroj = b.nextInt();
        
        System.out.println("Unesite cetvrti broj: ");
        int cetvrtiBroj = b.nextInt();
        
        int[] brojevi = {prviBroj, drugiBroj, treciBroj, cetvrtiBroj};
        int najveci = brojevi[0];
        
        for (int i = 1; i < brojevi.length; i++) {
            najveci = Math.max(najveci, brojevi[i]);
        }
        
        
        if (greska(prviBroj, drugiBroj, treciBroj, cetvrtiBroj)) {
            System.out.println("Greska, postoje dva ili vise jednakih brojeva!");
        } else {
            System.out.println("Broj " + najveci + " je najveci!");
        }
        
        
    }
    
    public static boolean greska(int a, int b, int c, int d) {
        return (a == b || a == c || a == d || b == c || b == d || c == d);
    }
}
