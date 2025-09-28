package oop14;

import java.util.Scanner;

public class OOP14 {
    public static void main(String[] args) {
        Scanner kamatna_stopa = new Scanner(System.in);
        
        System.out.print("Unesite nesto (Ctrl+Z ili Ctrl+D za kraj): ");
        while(kamatna_stopa.hasNextLong()) {
            String token = kamatna_stopa.next();
            System.out.println("Procitan token: " + token);
            System.out.println("");
            System.out.print("Unesite nesto (Ctrl+Z ili Ctrl+D za kraj): ");
        }
        
        kamatna_stopa.close();
        
    }
    
    
}
 

