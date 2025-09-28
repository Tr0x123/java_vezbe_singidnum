package oop13;

import java.util.Scanner;

public class OOP13 {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Unesite neku celobrojnu vrednost: ");
            int brojA = s.nextInt();
            s.nextLine();
            System.out.println("Korisnik je uneo: " + brojA);
            System.out.println("Unesite ime korisnika: ");
            String ime = s.nextLine();
            System.out.println("Ime korisnika je: " + ime);
            // jednolinijski komentar
            /*
            viselinijski komentar
             */
        }
    }
    
}
