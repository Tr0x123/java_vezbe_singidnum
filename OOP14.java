package oop14;

import java.util.Scanner;

public class OOP14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Unesite nesto (exit za kraj): ");
            String token = s.next();

            if (token.equalsIgnoreCase("exit")) {
                System.out.println("Kraj programa.");
                break;
            }

            System.out.println("Procitan token: " + token);
            System.out.println();
        }

        s.close();
    }
}
