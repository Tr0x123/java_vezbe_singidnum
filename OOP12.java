package oop12;

public class OOP12 {
    public static void main(String[] args) {
        // definisati dve promenljive za brojeve 15 i 35
        // definisati novu promenljivu koja sabira te dve promenljive
        
        int a = 15;
        int b = 35;
        int c = a + b;
        
        // Ispisati "Suma prethodna dva broja ja: " vrednost trece promenljive i tacka na kraju
        
        System.out.println("Suma prethodna dva broja je: " + c + ".");
        
        // Ispisati "Tekst" i vrednosti obe promeljive jednu za drugom
        System.out.println("Tekst " + a + b);
        
        // Ispisati isto ali da promeljive budu u zagradama
        System.out.println("Tekst " + (a + b));
        
        // Ispisati jednu + drugu + "Tekst" na kraju
        System.out.println(a + b + "Tekst");
        
    }
    
}
