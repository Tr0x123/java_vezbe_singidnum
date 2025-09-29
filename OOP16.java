package oop16;

import java.util.Scanner;

public class OOP16 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            
            System.out.print("Unesi broj: ");
            int broj = s.nextInt();
            s.nextLine();
            System.out.println("Uneli ste broj: " + broj);
            
            
            // Proverava za svaki uneti broj da li je paran :D
            if (broj % 2 == 0) {
                System.out.println("Broj " + broj +  " je paran.");
                System.out.println("");
            } else {
                System.out.println("Broj " + broj + " nije paran.");
                System.out.println("");
            }
            
        }       
    }
}
