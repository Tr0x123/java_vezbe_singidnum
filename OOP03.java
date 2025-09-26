package oop03;

import java.util.Scanner;

public class OOP03 {
    public static void main(String[] args) {
        
        Scanner b = new Scanner(System.in);
        
        System.out.print("Unesite prvi broj: ");
        int broj1 = b.nextInt();
        
        System.out.print("Unesite drugi broj: ");
        int broj2 = b.nextInt();
        
        int zbir = zbir(broj1, broj2);
        int razlika = razlika(broj1, broj2);
        int proizvod = prozivod(broj1, broj2);
        double kolicnik = kolicnik(broj1, broj2);
        
        System.out.println("");
        
        System.out.println("Zbir unetih brojeva je: " + zbir);
        System.out.println("Razlika unetih brojeva je: " + razlika);
        System.out.println("Proizvod unetih brojeva je: " + proizvod);
        System.out.println("Kolicnik unetih brojeva je: " + kolicnik);
        
        
    }
    
    public static int zbir(int a, int b) {
        return a+b;
    }
    
    public static int razlika(int a, int b) {
        return a-b;
    }
    
    public static int prozivod(int a, int b) {
        return a*b;
    }
    
    public static double kolicnik(double a, double b) {
        return a/b;
    }
    
}

