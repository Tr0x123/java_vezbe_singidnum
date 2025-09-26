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
        
        int prosek = (ocena1 + ocena2 + ocena3) / 3;
        
        if (prosek < 2) {
        
            System.out.println("Nedovoljan uspeh");
            
        } else if (prosek < 3.5) {
            
            System.out.println("Dobar uspeh");
            
        } else if (prosek < 4.5) {
            
            System.out.println("Vrlo dobar uspeh");
            
        } else {
            
            System.out.println("Odlican uspeh!");
            
        }
        
        
    }
    
}


/**
 * 
 * Unesi 3 ocene sa tastature
 * Izracunaj prosek
 * Na osnovu proseka ispisi poruku
 * 
 * Prosek manji od 2 -> Nedovoljan uspeh
 * 2 - 3.5 -> Dobar uspeh
 * 3.5 - 4.5 -> Vrlo dobar uspeh
 * 4.5 i vise -> Odlican uspeh
 * 
 */