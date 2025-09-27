package oop08;

import java.util.Scanner;

public class OOP08 {

    public static void main(String[] args) {
        
        int f;
        int c;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite temeperaturu u Farenhajtima: ");
        f = s.nextInt();
        
        c = 5*(f-32)/9;
        System.out.println("Temperatura u Celzijusima: " + c);
    }
    
}


// Formula za pretvaranje Farenhajtovih stepeni u Celzijusove
/*
/ c = 5*(f-32)/9
*/