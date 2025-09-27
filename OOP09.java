package oop09;

import java.util.Scanner;

public class OOP09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();
        
        boolean prost = true;
        
        if(broj <= 1) {
            prost = false;
        } else {
            for(int i = 2; i <= Math.sqrt(broj); i++) {
                if (broj % i == 0) {
                    prost = false;
                    break;
                }
            }
        }
        
        if (prost) {
            System.out.println("Broj " + broj + " je prost.");
        } else {
            System.out.println("Broj " + broj + " nije prost.");
        }
    }
    
}
