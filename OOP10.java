package oop10;

import java.util.Scanner;

public class OOP10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Unesite duzinu stranice a: ");
        int stranica_A = s.nextInt();
        
        System.out.println("Unesite duzinu stranice b: ");
        int stranica_B = s.nextInt();
        
        int O = stranica_A * 2 + stranica_B * 2;
        int P = stranica_A * stranica_B;
        
        System.out.println("Obim je: " + O);
        System.out.println("Povrsina je " + P);
               
        
    }
    
}
