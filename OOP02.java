package oop02;

import java.util.Scanner;

public class OOP02 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Unesite broj za proveru parnosti: ");
        int unesenBroj = p.nextInt();
        
    
        
        if (unesenBroj % 2 == 0) {
            System.out.println("Paran!");
        } else {
            System.out.println("Neparan!");
        }
        
    }
    
    
}
