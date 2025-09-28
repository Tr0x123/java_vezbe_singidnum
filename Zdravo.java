package com.mycompany.zdravo;
import java.util.*;

public class Zdravo {

    public static void main(String[] args) 
    {
        Scanner tastatura = new Scanner(System.in);
        
        System.out.print("Unesite vase ime: ");
        String ime = tastatura.nextLine();
        
        System.out.print("Koliko imate godina: ");
        int god = tastatura.nextInt();
        
        System.out.println("-----------------------");
        System.out.println("ZELIMO VAM DOBRODOSLICU");
        System.out.println("-----------------------");
        
        System.out.println("Zdravo " + ime + "!");
        System.out.println("Imate " + god + " godina.");

        tastatura.close();
    }
}
