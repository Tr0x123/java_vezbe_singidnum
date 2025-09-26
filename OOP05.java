package oop05;

import java.util.Scanner;

public class OOP05 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj za proveru paran / neparan: ");
        int broj = s.nextInt();
        
        if(broj % 2 == 0) {
            System.out.println("BROJ " + broj + " JE PARAN!");
        } else {
            System.out.println("BROJ " + broj + " NIJE PARAN!");
        }
        
        
        
        
    }
    
}
