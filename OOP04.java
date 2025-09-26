package oop04;

import java.util.Scanner;

public class OOP04 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite rec/recenicu: ");
        String rec = s.nextLine();
        
        
        int duzina = rec.replace(" ", "").length();
        System.out.println("Duzina unete reci/recenice je " + duzina + " karaktera.");
        
    }
    
}
